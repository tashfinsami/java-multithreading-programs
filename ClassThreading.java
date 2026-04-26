class TaskManagerCls extends Thread {
    private int serial;

    public TaskManagerCls(int serial) {
        this.serial = serial;
    }

    public void run() {
        System.out.println("Task " + serial + " is being run by " + Thread.currentThread().getName());
    }
}

public class ClassThreading {
    public static void main(String[] args) {
        Thread t1 = new TaskManagerCls(0);
        Thread t2 = new TaskManagerCls(1);
        Thread t3 = new TaskManagerCls(2);
        Thread t4 = new TaskManagerCls(3);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

