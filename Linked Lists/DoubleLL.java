public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode; 
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //addLast - HW
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail = tail.next;
    }
    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //removeFirst
    public int removeFirst(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //removeLast - HW
    public int removeLast(){
        if(head == null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        // dll.addFirst(3);
        // dll.addFirst(2);
        // dll.addFirst(1);

        // dll.print();
        // System.out.println(dll.size);

        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);

        // HW
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);

        dll.print();
        
        dll.removeLast();
        dll.print();

       

    }
}
