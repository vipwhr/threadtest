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
        while(i != j){
            while(j != i){
                if(numbers[j] < flag){
                    numbers[i] = numbers[j];
                    break;
                }
                j--;
            }
            while(j != i){
                if(numbers[i] > flag){
                    numbers[j] = numbers[i];
                    break;
                }
                i++;
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
}
