package algorithm.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        int[] param = {1,5,4,2,3,8,7,9,34,43,64,321,542,3124,233};
        int[] temp = new int[param.length];
        sort(param,0,param.length-1,temp);
        System.out.println(Arrays.toString(param));
    }

    public static void sort(int[] param){
        int[] temp = new int[param.length];
        long startTime = System.currentTimeMillis();
        sort(param,0,param.length-1,temp);
        long endTime = System.currentTimeMillis();
        System.out.println("MergeSort :  " + (endTime-startTime));
    }

    public static void sort(int[] param,int left,int right, int[] temp){
        if(left<right){
            int mid = (right+left)/2;
            sort(param,left,mid,temp);
            sort(param,mid+1,right,temp);
            mergeTwo(param,left,mid,right,temp);
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

}
