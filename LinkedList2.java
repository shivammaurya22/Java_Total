
import org.w3c.dom.stylesheets.LinkStyle;

class Node{
    int data;
    Node next;

    // define constructor
    Node(int data){
        this.data = data;
        this.next = next;
    }
}

class LinkedLists{
    Node head;

    // insert at the start point define method
    // public void insertAtStart(int data){
    //     Node newnode = new Node(data);
    //     newnode.next = head; // Point new node to the current head
    //     head = newnode; // Update head to the new node.
    // } 

    // define the method insert at the end 
    public void insertAtEnd(int data){
       Node newnode = new Node(data);
       if(head == null){
        head = newnode;
        return;
       }
       Node temp = head;
       while(temp.next != null){
          temp = temp.next;
       }
       temp.next = newnode;
    }

    // display the list define the method
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedLists links = new LinkedLists();
        // links.insertAtStart(30);
        // links.insertAtStart(20);
        // links.insertAtStart(10);
        links.insertAtEnd(10);
        links.insertAtEnd(20);
        links.insertAtEnd(30);
        links.display();
    }
}
