public class ThreadDemo {
    public static void main(String[] args) {
        //First thread : Thread - 
        Runnable thread1  = () ->{
            //This is a body of the thread
            for(int i=0; i<=10; i++){
                System.out.println("value if the i is " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(thread1);
        t.setName("Shirisha");
        t.start();
    }
    
}
