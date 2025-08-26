public class DeleteNAfterMNodes {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode=new Node(data);
      if(head==null){
        head=tail=newNode;
        return;
      }
      newNode.next=head;
      head=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("LinkedList is Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
         System.out.println("null");
    }
    public void deleteNafterMnodes(int m,int n){
        if(m==0) {
            System.out.println("null");
            return;
        }
     Node curr=head;
     while(curr!=null){
        //traverse m nodes
        for(int i=1;i<m&&curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null) break;
        Node temp=curr ;
        //traverse N nodes
        for(int i=0;i<n&&temp!=null;i++){
         temp=temp.next;
        }
        curr.next=temp.next ;
        curr=temp.next;
      }
    }

    
    public static void main(String[] args) {
        DeleteNAfterMNodes ll =new DeleteNAfterMNodes();
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();

        ll.deleteNafterMnodes(2, 2);
        ll.printList();

    }
}
