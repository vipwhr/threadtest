package algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void popSort(int[] param){
        long start = System.currentTimeMillis();
        for(int i = 0;i<param.length - 1;i++){
            for(int j = i;j<param.length ;j++){
                if(param[j] < param[i]){
                    int temp = param[j];
                    param[j] = param[i];
                    param[i] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("BubbleSort :  " + (end-start));
        //System.out.println(Arrays.toString(param));
    }

}
