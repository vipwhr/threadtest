import algorithm.ergodic.TreeBFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){

        long start = System.currentTimeMillis();

        int[] param = new int[10000000];
        int length = param.length;
        int temp = 0;
        for(int i = 0;i<length;i++){
            temp = param[i];
        }
        System.out.println("循环取值：   " + (System.currentTimeMillis() - start));
        ArrayList list = new ArrayList();
        for(int i = 0;i<10000000;i++){
            list.add(0);
        }

        System.out.println("循环赋值：   " + (System.currentTimeMillis() - start));

        for(int i = 0;i<10000000;i++){
            list.get(0);
        }

        System.out.println("array循环取值：   " + (System.currentTimeMillis() - start));


        HashSet set = new HashSet();
        for(int i = 0;i<10000000;i++){
            set.add(i);
        }

        Integer tempStr = 0;
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            tempStr = (Integer) iterator.next();
        }
        System.out.println("set循环赋值：   " + (System.currentTimeMillis() - start));

    }

    public static void printTime(String startTime,String endTime){

        String[] startTimes = startTime.split(":");
        String[] endTimes = endTime.split(":");
        int startHour = Integer.valueOf(startTimes[0]);
        int startMinute = Integer.valueOf(startTimes[1]);
        int endHour = Integer.valueOf(endTimes[0]);
        int endMInute = Integer.valueOf(endTimes[1]);


    }

}
