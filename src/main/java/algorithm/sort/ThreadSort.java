package algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSort {

    private static Collection<Callable<Integer>> threadList = new ArrayList<Callable<Integer>>();
    private static ExecutorService pool = Executors.newCachedThreadPool();
    private static int THREAD_SIZE = 8;

    public static void sort(int[] param){
        long start = System.currentTimeMillis();
        //首先，设计当前线程的总数下，每个数组的大小
        int length = param.length;
        //System.out.println("总量：   " + length);
        int perSize = length/THREAD_SIZE;

        for(int i = 0;i<THREAD_SIZE;i++){
            if(i == THREAD_SIZE - 1){
                threadList.add(new QuickSorter(param,i*perSize,param.length - 1));
            }else{
                threadList.add(new QuickSorter(param,i*perSize,(i+1)*perSize));
            }
        }
        try {
            pool.invokeAll(threadList);
            //System.out.println("各自进行了快速排： "+Arrays.toString(param));
            int mergeTimes = THREAD_SIZE - 1;
            int[] temp = new int[param.length];
            int i = 0;
            for (i = 0; i < mergeTimes - 1; i++) {
                mergeTwo(param,0,perSize*(i+1)-1,perSize*(i+2)-1,temp);
            }
            //System.out.println("最后一次合并之前： " +Arrays.toString(param));
            mergeTwo(param,0,perSize*(i+1)-1,param.length-1,temp);
            long end = System.currentTimeMillis();
            System.out.println("ThreadSort :  " + (end-start));
            //System.out.println("最后产生的排序是： "+Arrays.toString(param));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void mergeTwo(int[] param,int left, int mid, int right, int[] temp){
        int i = left;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j <= right){
            if(param[i] <= param[j]){
                temp[k++] = param[i++];
            }else{
                temp[k++] = param[j++];
            }
        }

        while(i<=mid){//将左边剩余元素填充进temp中
            temp[k++] = param[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[k++] = param[j++];
        }

        k = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            param[left++] = temp[k++];
        }

    }

    public static void main(String[] args){
        int[] param = {1,5,4,2,3,8,7,9,34,43,64,321,542,3124,233,324,345,432,35,345,6565,454,4324,545};
        sort(param);
        //System.out.println("main last line");
    }

}

class QuickSorter implements Callable<Integer>{

    private int[] param;
    private int start;
    private int end;

    public QuickSorter(int[] param,int start,int end){

        this.param = param;
        this.start = start;
        this.end = end;
    }

    public Integer call() throws Exception {
        //System.out.println("test" + start + " ----- " + end);
        QuickSort.sort(param,start,end);

        return null;
    }
}
