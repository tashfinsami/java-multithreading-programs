class TaskManagerInt implements Runnable {
    private int serial;
    public TaskManagerInt(int serial) {
        this.serial = serial;
    }
    public void run() {
        System.out.println("Task " + serial + " is being run by " + Thread.currentThread().getName());
    }
}

public class InterfaceThreading {
    public static void main(String[] args) {
        Runnable job1 = new TaskManagerInt(0);
        Runnable job2 = new TaskManagerInt(1);
        Runnable job3 = new TaskManagerInt(2);
        Runnable job4 = new TaskManagerInt(3);

        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);
        Thread t3 = new Thread(job3);
        Thread t4 = new Thread(job4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
