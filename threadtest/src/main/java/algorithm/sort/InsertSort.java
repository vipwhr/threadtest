package algorithm.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args){
        int[] param = {1,5,4,2,3,8,7,9,34,43,64,321,542,3124,233};
        sort(param);
        for (int i = 0; i < param.length; i++) {
            System.out.println(param[i]);
        }
    }

    public static void sort(int[] param){
        long start = System.currentTimeMillis();
        int length = param.length;
        for(int i = 1;i<length;i++){
            if(param[i] < param[i - 1]){
                int temp = param[i];
                int j = 0;
                for( j = i-1;j>0 && param[j] > temp;j--){
                    param[j+1] = param[j];
                }
                param[j+1] = temp;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("InsertSort :  " + (end-start));
        //System.out.println(Arrays.toString(param));
    }

}
