// Methods cant be declared inside the main method
// methods belongs to the class not to the method 
// If u put the metthod inside the main method then it will show error
// u can achive this using lambde expressions
//  and some built in java methods (pre declared methods in inbuilt classes)

// search in stack overflow




public class Client implements Callback{
    public static void main(String[] args){
        // Client client = new Client();
        Callback client = new Client();
        // client.show();
        client.callback(6);



    }
            void show(){
                System.out.println("\n");
            System.out.println("Hello this is clients show method calling");
        }
        @Override
        public void callback(int num) {
            System.out.println("This is from inherited method");
        }

    
}
