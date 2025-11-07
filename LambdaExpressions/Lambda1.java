public class Lambda1 {
    public static void main(String[] args){
        //Runnable interface
        //It has run() method
        //Implementing the runnable functional interface
        Runnable a = ()->System.out.println("This is the implementation of runnable functional interace");
        a.run();
    }

}
