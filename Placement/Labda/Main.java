public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Lambda Expressions!!!!!!!");





        //Using LAMBDA
        //we can remove {} if we have only one line
        MyInter i = ()->{
            System.out.println("This is the first time i sm using the lambda function");
        };
        i.sayHello();


        //we can remove {} if we have only one line

        MyInter i2 = ()->
            System.out.println("This is the second time i sm using the lambda function");
        
        i2.sayHello();






        SumInter s = (a , b) -> a+b;
        System.out.println(s.sum(5 ,7));


        LengthInter l = str -> str.length();
        System.out.println(l.getLength("Fun World!"));
        







        // SumInter si = (int a , int b)->{
        //     return a + b;
        // };

        // System.out.println(si.sum(2 , 5));




        // MyInter i = new MyInter(){

        //     @Override
        //     public void sayHello() {
        //         System.out.println("This is my first anonymous calss");
        //     }
            
        // };
        // i.sayHello();
        

        // MyInter i2 = new MyInter() {

        //     @Override
        //     public void sayHello() {
        //         System.out.println("this is second anaonymous class:");
        //     }
            
        // };
        // i2.sayHello();





        // MyInter myInter=new MyInterImpl();
        // myInter.sayHello();

    }
    
}
