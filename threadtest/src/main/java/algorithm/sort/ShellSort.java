package algorithm.sort;

import java.util.Arrays;

public class ShellSort {

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
        for(int step = length/2;step>0;step/=2){
            for(int i = 0;i<step;i++){
                for(int j = i+step;j<length;j+=step){
                    if(param[j] < param[j - step]){
                        int temp = param[j];
                        int k = 0;
                        for( k = j-step;k>i+step && param[k] > temp;k-=step){
                            param[k+step] = param[k];
                        }
                        param[k+step] = temp;
                    }
                }
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("ShellSort :  " + (end-start));
        //System.out.println(Arrays.toString(param));
    }

}
