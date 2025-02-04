// Using Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

// Using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class BasicThreadCreation {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
    }
}

/* Output:
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1
*/
