class Node{
    int data;
    Node next;

    // define constructors
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedLists{
    Node head;

    // insert at the beginning of the node
    public void insertAtSepcified(int data, int position){
        Node newnode = new Node(data);
        if(position == 0){
            newnode.next = head;
            head = newnode;
        }
        Node temp = head;
        int count = 0;
        // Traverse to the Position(position - 1)
        while(temp != null && count < position - 1){
            temp = temp.next;
            count++;
        }
        // if Position is beyond the list 
        if(temp == null){
            System.out.println("Position Out of bounds.");
        }
        // insert the node at the sepecified position
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedLists lst = new LinkedLists();
        // lst.insertAtStart(30);
        // lst.insertAtStart(20);
        // lst.insertAtStart(10);
        lst.insertAtSepcified(10, 0);
        lst.insertAtSepcified(20, 1);
        lst.insertAtSepcified(30, 2);
        lst.insertAtSepcified(40, 3);
        lst.insertAtSepcified(56, 2);
        lst.display();

    }
}
