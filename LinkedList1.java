class Node{
    int data;
    Node next;

    // constructors
    public Node(int data){
      this.data = data;
      this.next = null;
    }
}
// second class LinkedList
class LinkedList{
    Node head;  // head of the list 

    // insert a node at the end
    public void insertNode(int data){
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    // Print the Linked List
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    } 
}


public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.insertNode(10);
        lst.insertNode(20);
        lst.insertNode(30);
        lst.display();

    }
}
