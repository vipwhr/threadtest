package thread;

public class ThreadBoxImpl implements ThreadBox{
    public void testJoinMethod() {

        MyJoinThread myJoinThread1 = new MyJoinThread();
        Thread thread1 = new Thread(myJoinThread1);
        thread1.setName("Thread001");
        MyJoinThread myJoinThread2 = new MyJoinThread(thread1);
        Thread thread2 = new Thread(myJoinThread2);
        thread2.setName("Thread002");
        MyJoinThread myJoinThread3 = new MyJoinThread(thread2);
        Thread thread3 = new Thread(myJoinThread3);
        thread3.setName("Thread003");

        thread3.start();
        thread2.start();
        thread1.start();

    }
}
