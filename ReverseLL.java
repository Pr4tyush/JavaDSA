// Reverse a Linked List

class ReverseLL{
    Node head;
    private int size;

    ReverseLL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=next;
            size++;
        }
    }

    //Add First , Last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next!=null){
            currNode=currNode.next;

        }
        currNode.next=newNode;
        newNode.next=null;
    }
    //print

    public void printList(){
        if(head==null){
            System.out.println("List is empty ");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data + " -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    //Delete first 
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;

    }

    //Delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty ");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast=null;
    }
    public int getSize(){
        return size;
    }
//Reverse Link List
    public void reverseIterate(){
        if(head==null || head.next==null){
            return ;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != 0){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    

    public static void main(String[] args){
        ReverseLL list = new ReverseLL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        
        System.out.println(list.getSize());


        list.addFirst("this");
        System.out.println(list.getSize());





        list.reverseIterate();
        list.printList();


    }
}