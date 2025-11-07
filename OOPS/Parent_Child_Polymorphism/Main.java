package Parent_Child_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.name= "abcd";
        child.salary= 1000;
        System.out.println("The name is: " + child.name);
        System.out.println("The salary is: " + child.salary);


        Parent parentrefchildobj = new Child(); // Upcasting
        parentrefchildobj.name = "abcd";
        System.out.println("The name is: " + parentrefchildobj.name);
        // parentrefchildobj.salary = 1000; // Not allowed
        // gives compile time error

        Parent parent = new Parent();
        parent.name = "xyz";
        System.out.println("The name is: " + parent.name);
        // parent.salary = 1000; // Not allowed
        // gives compile time error

    }

}
