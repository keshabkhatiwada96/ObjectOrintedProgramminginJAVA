class SleepDemo extends Thread {
    public void run(){
        for (int i = 1; i<=5;i++){
            System.out.println("Thread is runnng " +i);
            try {
            Thread.sleep(2000);
            } catch (Exception e) {}

        }
    }
    public static void main(String[] args) {
        SleepDemo t = new SleepDemo();
        t.start();
    }
}