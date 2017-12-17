package thread;

public class MyJoinThread implements Runnable{

    private Thread preThread;

    public MyJoinThread(Thread preThread){
        this.preThread = preThread;
    }

    public MyJoinThread(){}


    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(preThread != null){
            try {
                preThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "执行结束！");

    }
}
