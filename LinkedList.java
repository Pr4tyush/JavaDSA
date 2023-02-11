class LinkedList{
    Node head;
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=next;
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
        head=head.next;

    }

    //Delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty ");
            return;
        }
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
    

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();
    }}