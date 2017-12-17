package algorithm.sort;

import java.util.Arrays;

public class HeapSort {

    public static void adjustHeap(int[] param,int parent,int length){
        int temp = param[parent];
        int child = parent * 2 + 1;

        while(child < length){

            if(child + 1 < length && param[child] < param[child + 1]){
                child ++;
            }

            if(temp > param[child]){
                break;
            }

            param[parent] = param[child];

            parent = child;
            child = parent * 2 + 1;
        }

        param[parent] = temp;

    }

    public static void sort(int[] param){
        long start = System.currentTimeMillis();
        for(int i = param.length/2;i>=0;i--){
            adjustHeap(param,i,param.length);
        }
        for(int j = 1;j<param.length + 1;j++){
            int temp = param[param.length - j];
            param[param.length - j] = param[0];
            param[0] = temp;

            adjustHeap(param,0,param.length - j);
        }
        long end = System.currentTimeMillis();
        System.out.println("HeapSort :  " + (end-start));
        //System.out.println(Arrays.toString(param));
    }

    public static void main(String[] args){
        int[] param = { 1, 3, 4, 5, 2, 6, 9, 7, 8, 0 };
        sort(param);
    }

}
