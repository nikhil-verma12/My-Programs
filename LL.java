class LL {
    Node head;
    private int size;

    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next; 
        
        Node(String data){
            this.data = data;
            this.next=null;
            size++;
        }
    }

    //Add element at first--------------------------------------------------------------------------------------------
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add element at last-----------------------------------------------------------------------------------------------
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
    }
    Node currNode = head;
    while(currNode.next != null){
        currNode = currNode.next;
    }
    currNode.next = newNode;
    }
    
    //Printing LinkedList--------------------------------------------------------------------------------------------------
    public void printList(){
    if(head==null){
        System.out.println("List is Empty");
        return;
    }
    Node currNode = head;
    while(currNode!= null){
        System.out.print(currNode.data + "->");
        currNode = currNode.next;
    }
    System.out.println("NULL");
    }

    //Delete first element ----------------------------------------------------------------------------------------------------
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //Delete last element------------------------------------------------------------------------------------------------------
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        secondLast.next = null;
       }

    //Size------------------------------------------------------------------------------------------------------------------------
    public int getSize(){
       return size;
    }

    //Reverse LinkedList using Iteration-----------------------------------------------------------------------------------------
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;    
    }

    //Reverse LinkedList using Recursion----------------------------------------------------------------------------------
    public Node  reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

public static void main(String args[]){
        LL list = new LL();
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("4");
        // list.printList();
        // System.out.println(list.getSize());
        
        // list.deleteFirst();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        // System.out.println(list.getSize());

        // list.reverseIterate();
        // list.printList();

        //list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
