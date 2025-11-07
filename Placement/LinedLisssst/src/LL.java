package Placement.LinedLisssst.src;
import java.util.Scanner;

public class LL
{
    Node head = null;
    Node tail = null;
    int size;
    public class Node
    {
        int value;
        Node next;
        public Node(int value , Node next)
        {
            this.value = value;
            this.next = next;

        }

        public Node(){
        }

        public Node(int value) {
            this.value = value;
        }

    }

    private void insertFirst(int value)
    {
        Node node = new Node(value);
        if(head==null)
        {
            head = node;
            head.next = null;
            tail = head;
            size++;
    }else{
        node.next=head;
        head = node;
        size++;
    }
    }


    private void insertLast(int value)
    {
        Node node = new Node(value);
        if(head == null)
        {
            insertFirst(value);
        }
        else{
            tail.next = node;
            tail = tail.next;
            size++;
        }
    }

    private  void removeEveryKthElement( int k ) {
        if(head==null || k<=0)
        {
            return;
        }
        Node ptr;
        ptr = head;
        Node prev = null;
        int count = 1;
        while(ptr!=null)
        {
            if(count%k ==0)
            {
                if(prev!=null)
                {
                    prev.next = ptr.next;

                }else{
                    head = ptr.next;
                }
            }
            else{
                prev = ptr;
            }
            ptr = ptr.next;
            count++;
            
            
        }
    
    
}




public void insertAtPosition(int value , int pos)
{
    if(pos == 0)
    {
        insertfirst(value);
        return;
    }
    if(pos ==size)
    {
        insertlast(value);
        return;
    }
    Node node = new Node(value);
    Node temp;
    Node cur = head;
    temp = cur.next;
    int a = 1;
    while(a!=pos){
         cur = cur.next;
         temp = cur.next;
         a++;
    }
    cur.next = node;
    node.next = temp; 
}


private void insertlast(int value) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insertlast'");
}


public Node reverseList(Node head) {
    if (head == null) { 
        return head;
    }
    Node prev = null;
    Node present = head;
    Node nextNode = present.next;

    while (present != null) {
        present.next = prev;
        prev = present;
        present = nextNode;
        if (nextNode != null) {
            nextNode = nextNode.next;
        }
    }
    return prev;
}


public void deleteFirst()
{
    Node temp;
    temp = head;
   // System.out.println(temp.value);
    head = head.next;
    // display();

}
public void deleteLast()
{
    if(head==null)
    {
        return;
    }
    if(head.next==null)
    {
        head = null;
        return;
    }
    Node temp;
    temp = head;
    while(temp.next.next!=tail)
    {
        temp = temp.next;
    }
    tail = temp;
    tail.next = null;
}



 public void deleteAtPos(int pos)
{
    if(pos== 0)
    {
        deleteFirst();
    }
    if(pos == size)
    {
        deleteLast();
    }
    Node temp;
    temp = head.next;
    Node cur=head;
    int a=1 ;
    while(a!=pos)
    {
       cur = cur.next;
       temp = temp.next;
        a++;
    }
   cur.next = temp;
    size-=1;

}

    void display(LL list)
    {
        Node ptr;
        ptr = head;
        while(ptr!=tail.next)
        {
            System.out.print(ptr.value + "----->");
            ptr = ptr.next;
        }
        System.out.println("The size of the linked list is " + size);
    }

    

public static void main(String[] srgs)
{
    
    LL list = new LL();
    list.insertFirst(1);
     list.insertFirst(2);
      list.insertFirst(3);
       list.insertFirst(4);
    
    list.insertLast(5);
     list.insertLast(8);
      list.insertLast(7);
      
    // list.insertFirst(89);
    //  list.insertFirst(90);
    //   list.insertFirst(87);
    //    list.insertFirst(40);
    
    // list.insertLast(56);
    //  list.insertLast(84);
    //   list.insertLast(79);
     
    // list.insertFirst(11);
    //  list.insertFirst(22);
    //   list.insertFirst(33);
    //    list.insertFirst(44);
    
    // list.insertLast(56);
    //  list.insertLast(81);
    //   list.insertLast(73);

list.display(list);
Scanner in = new Scanner(System.in);
int k = in.nextInt();
list.removeEveryKthElement( k );
list.display(list);

}


public void insertfirst(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insertfirst'");
}




}































// public class LL {
//         Node head;
//         Node tail;
//         int size;
//         LL next;

//     public LL() {
//         }


//     private class Node{ 
//         int value;
//         Node next;

//         public Node(int value, LL.Node next) {
//             this.value = value;
//             this.next = next;
//         }

//         public Node(int value) {
//             this.value = value;
//         }
//     }


// public void insertfirst(int value)
// {
//     Node node = new Node(value);
//     node.next = head;
//    head = node;
//     if(tail!= null)
//     {
//         node = tail;
//     }
   
//    node = node.next;
//    size+=1;
// }


// public void insertlast(int value)
// {
//     if(tail==null)
//     {
//         insertfirst(value);
//         return;
//     }
//     Node node = new Node(value);
//     tail.next = node;
//     tail = node.next;
//     size+=1;
// }

// public void insertAtPosition(int value , int pos)
// {
//     if(pos == 0)
//     {
//         insertfirst(value);
//         return;
//     }
//     if(pos ==size)
//     {
//         insertlast(value);
//         return;
//     }
//     Node node = new Node(value);
//     Node temp;
//     Node cur = head;
//     temp = cur.next;
//     int a = 1;
//     while(a!=pos){
//          cur = cur.next;
//          temp = cur.next;
//          a++;
//     }
//     cur.next = node;
//     node.next = temp; 
// }


// public Node reverseList(Node head) {
//     if (head == null) { 
//         return head;
//     }
//     Node prev = null;
//     Node present = head;
//     Node nextNode = present.next;

//     while (present != null) {
//         present.next = prev;
//         prev = present;
//         present = nextNode;
//         if (nextNode != null) {
//             nextNode = nextNode.next;
//         }
//     }
//     return prev;
// }


// public void deleteFirst()
// {
//     Node temp;
//     temp = head;
//    // System.out.println(temp.value);
//     head = head.next;
//     // display();

// }
// public void deleteLast()
// {
//     if(head==null)
//     {
//         return;
//     }
//     if(head.next==null)
//     {
//         head = null;
//         return;
//     }
//     Node temp;
//     temp = head;
//     while(temp.next.next!=tail)
//     {
//         temp = temp.next;
//     }
//     tail = temp;
//     tail.next = null;
// }



// public void deleteAtPos(int pos)
// {
//     if(pos== 0)
//     {
//         deleteFirst();
//     }
//     if(pos == size)
//     {
//         deleteLast();
//     }
//     Node temp;
//     temp = head.next;
//     Node cur=head;
//     int a=1 ;
//     while(a!=pos)
//     {
//        cur = cur.next;
//        temp = temp.next;
//         a++;
//     }
//    cur.next = temp;
//     size-=1;

// }

// public void display()
// {
//     Node temp;
//     temp = head;
//     while(temp!= null)
//     {
//         System.out.println(temp.value);
//         temp = temp.next;
//     }
//     System.out.println("End");
// }

// }
