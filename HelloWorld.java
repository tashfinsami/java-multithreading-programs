public class HelloWorld extends Thread {
    private String tname;
    public HelloWorld(String tname) {
        this.tname = tname;
    }
    @Override
    public void run() {
        System.out.println("Hello World from " + tname);
    }

    public static void main(String args[]) {
        HelloWorld thread1 = new HelloWorld("thread 0");
        HelloWorld thread2 = new HelloWorld("thread 1");
        thread1.start();
        thread2.start();
    }
}
