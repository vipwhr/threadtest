package algorithm.sort;

import java.util.Arrays;

public class CountSort {

    public static void sort(int[] param){
        long start = System.currentTimeMillis();
        int sourceLength = param.length;
        int biggest = 0;
        for(int i = 0;i<sourceLength;i++){
            if(param[i] > biggest){
                biggest = param[i];
            }
        }

        int[] flag =new int[biggest + 1];
        for(int i = 0;i<sourceLength;i++){
            flag[param[i]] ++;
        }

        int temp  = 0;
        for(int i = 0;i<biggest + 1;i++){
            while(flag[i] != 0){
                param[temp] = i;
                flag[i] --;
                temp ++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("CountSort :  " + (end-start));
    }

    public static void main(String[] args){
        int[] param = {1,5,4,2,3,8,7,9,34,43,64,321,542,3124,233};
        sort(param);
        System.out.println(Arrays.toString(param));
    }
}
