package jdkPractice;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueTest {

    static LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<Integer>();

    public static int getNumber(){
        try {
            return linkedBlockingQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 0;
    }



    public static void main(String[] args){

        Thread thread = new Thread(new Puter(linkedBlockingQueue));
        thread.start();
        while(true){
            System.out.println(LinkedBlockingQueueTest.getNumber());
        }
    }
}
class Puter implements Runnable{

    LinkedBlockingQueue<Integer> linkedBlockingQueue ;
    public Puter(LinkedBlockingQueue<Integer> linkedBlockingQueue){
        this.linkedBlockingQueue = linkedBlockingQueue;
    }

    public void run() {
        try {
            Thread.sleep(10000);
            linkedBlockingQueue.put(18);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}