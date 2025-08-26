public class FindIntersectionPoint {
    public static class Node{
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
    public static Node findIntersectionPoint(Node head1,Node head2){
        //get the length of two lists
        int len1=getLength(head1);
        int len2=getLength(head2);

        //trim the larger list by the length difference
        while(len1>len2){
            head1=head1.next;
            len1--;
        }
        while(len2>len1){
            head2=head2.next;
            len2--;
        }

        //find the intersection point
        while(head1!=null && head2!=null){
            if(head1==head2) return head1;
            head1=head1.next;
            head2=head2.next;
        }
        return null;
    }

    public static int getLength(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    
    public static void main(String[] args) {
        FindIntersectionPoint ll =new FindIntersectionPoint();
        Node common = new Node(6);
        common.next = new Node(7);
        common.next.next = new Node(8);

        // List A: 1 → 2 → 3 → 6 → 7 → 8
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = common;

        // List B: 4 → 5 → 6 → 7 → 8
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = common;

        Node intersectionPoint=findIntersectionPoint(  head1,  head2);
        System.out.println("Intersection at node with data: " + 
            (intersectionPoint != null ? intersectionPoint.data : "No Intersection"));
         
    }
}
