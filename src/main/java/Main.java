import algorithm.ergodic.TreeBFS;

public class Main {

    public static void main(String[] args){

        printTime("09:30","11:30");

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
