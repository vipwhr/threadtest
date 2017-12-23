package algorithm.sort;

import java.util.Arrays;

public class QuickSort {

    public static void fastSort(int[] numbers,int start, int end){
        if(start == end || start > end){
            return;
        }
        int i = start;
        int j = end;
        int flag = numbers[i];
        while(i < j){
            while(i<j && numbers[j] >= flag){
                j--;
            }
            if(i<j){
                numbers[i++] = numbers[j];
            }

            while(i<j && numbers[i] < flag){
                i++;
            }
            if(i<j){
                numbers[j--] = numbers[i];
            }
        }
        numbers[i] = flag;
        fastSort(numbers,start,i-1);
        fastSort(numbers,i+1,end);
    }

    public static void sort(int[] param){
        long start = System.currentTimeMillis();
        fastSort(param,0,param.length-1);
        long end = System.currentTimeMillis();
        System.out.println("QuickSort :  " + (end-start));
        //System.out.println(Arrays.toString(param));
    }

    public static void sort(int[] param,int start,int end){

        fastSort(param,start,end);
        //System.out.println(Arrays.toString(param));
    }


    static public void main(String[] args){
        int[] param = {1,5,4,2,3,8,7,9,34,43,64,321,542,3124,233};
        sort(param);
        System.out.println(Arrays.toString(param));
    }
}
