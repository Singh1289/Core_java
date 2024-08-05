package date_10_may;


public class DeadlockDemo {
    public static void main(String[] args) throws InterruptedException {
        String s1 = "Ankita";
        String s2 = "Rahul";
        Thread t1 = new Thread() {
            public void run() {
                synchronized(s1){
                    System.out.println("Thread 1 Acquired lock on resource s1 "+s1);
//                    try {
//                        Thread.sleep(1000);
//                    } catch(Exception e) {
//                        System.out.println(e);
//                    }
                    synchronized(s2){
                    }   System.out.println("Thread 1 Acquired lock on resource s2 "+s2);
                    
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized(s2){
                    System.out.println("Thread 2 Acquired lock on resource s2 "+s2);
//                    try {
//                        Thread.sleep(500);
//                    } catch(Exception e) {
//                        System.out.println(e);
//                    }
                 synchronized(s1){
                 }  System.out.println("Thread 2 Acquired lock on resource s1 "+s1);
                   
                }
            }
        };
        t1.start();
        t1.sleep(500);
        t2.start();
    }
}
