package main.java.Concurrency;

class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }
}

class HellowThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new HellowThread()).start();
    }
}

// Pausing executions with sleep
class SleepMessages {
    public static void main(String[] args) {
        throws InterruptedException {
            String importantInfo[] = {
                    "Mares eat oates",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };

            for (int i = 0; i < importantInfo.length; i++) {
                // Pause for 4 seconds
                Thread.sleep(4000);
                // Print a message
                System.out.println(importantInfo[i]);
            }
        }
    }
}