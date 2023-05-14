package MultithreadingConcepts;

public class BasicsOfMultithreading {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.setName("Thread 1");

        MyThread myThread2 = new MyThread();
        myThread.setName("Thread 2");

        MyThread myThread3 = new MyThread();
        myThread.setName("Thread 3");
        RunnableThread runnableThread = new RunnableThread();

        myThread.start();
        myThread2.start();
        myThread3.start();

        new Thread(runnableThread).start();
        Thread t = new Thread("raw thread");
        t.start();
        System.out.println(t.isAlive());
    }

}

class MyThread extends Thread{
    public void run(){
        System.out.println("My Thread is running "+this.getName());
    }
}

class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable Thread is running");
    }
}