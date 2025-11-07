package Placement.LinedLisssst.src;
public class Main {
    public static void main(String[] args) throws Exception {
        LL list = new LL();
        list.insertfirst(6);
        list.insertfirst(5);
        list.insertfirst(4);
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(1);

        list.display(list);

        // Pass the head of the list to reverseList
        list.head = list.reverseList(list.head);

        // Display the reversed list
        list.display(list);
    }
}
