package algorithm.sort;

import java.util.Arrays;

public class SelectSort {

    public static void sort(int[] param){
        long start = System.currentTimeMillis();
        for(int i = 0;i<param.length - 1;i++){
            int temp = i;
            for(int j = i+1;j<param.length;j++){
                if(param[j] < param[temp]){
                    temp = j;
                }
            }

            int tempNumber = param[temp];
            param[temp] = param[i];
            param[i] = tempNumber;

        }
        long end = System.currentTimeMillis();
        System.out.println("SelectSort :  " + (end-start));
        //System.out.println(Arrays.toString(param));
    }


    public static void main(String[] args){
        int[] param = { 1, 3, 4, 5, 2, 6, 9, 7, 8, 0 };
        sort(param);
        //System.out.println(Arrays.toString(param));
    }

}
