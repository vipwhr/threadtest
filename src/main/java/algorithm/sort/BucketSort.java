package algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort {

    public static void sort(int[] param){
        long start = System.currentTimeMillis();
        int biggest = param[0];
        int length = param.length;
        for (int i = 1; i <length ; i++) {
            if(param[i] > biggest){
                biggest = param[i];
            }
        }
        int bit = 1;
        int bittemp = biggest/10;
        while(bittemp != 0){
            bittemp /= 10;
            bit ++;
        }
        //System.out.println("找到位数：   " + (System.currentTimeMillis() - start));
        //System.out.println("位数： "+bit);

        int flag = 10;
        int flag10 = flag/10;
        ArrayList<ArrayList> map = new ArrayList<ArrayList>();

        for(int i = 0;i<10;i++){
            map.add(new ArrayList());
        }


        int tempresult = 0;
        for(int i = 0;i<bit;i++){
            for (int j = 0; j < length; j++) {
                tempresult = param[j]%flag/flag10;
                map.get(tempresult).add(param[j]);
            }
            //System.out.println("找到合适的位置：   " + (System.currentTimeMillis() - start));
            //System.out.println("第 " + (bit + 1)+"次" + Arrays.toString(map));
            flag*=10;
            flag10 *=10;
            int resultFlag = 0;
            for(int k = 0;k<10;k++){
                int tempNumber = map.get(k).size();
                if(tempNumber > 0){
                    for(int j = 0;j<tempNumber;j++){
                        param[resultFlag] = (Integer) map.get(k).get(j);
                        resultFlag ++;
                    }
                }
                map.set(k,new ArrayList());
            }
            //System.out.println("提取并清空：   " + (System.currentTimeMillis() - start));
            //System.out.println("param:: " + Arrays.toString(param));
        }
        //System.out.println("排序基本完成等待提取：   " + (System.currentTimeMillis() - start));
        int resultFlag = 0;

        for(int k = 0;k<10;k++){
            int tempNumber = map.get(k).size();
            if(tempNumber > 0){
                for(int j = 0;j<tempNumber;j++){
                    param[resultFlag] = (Integer) map.get(k).get(j);
                    resultFlag ++;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("BucketSort :  " + (end-start));
    }

    public static void main(String[] args){
        int[] param = {1,4,13,8,321,67,3124,542};
        sort(param);
        System.out.println(Arrays.toString(param));
    }

}
