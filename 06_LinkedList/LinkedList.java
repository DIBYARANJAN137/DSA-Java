public class LinkedList {

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
    public static int size;

    public void addFirst(int data){
        //create a new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        //point new node's next to  head
        newNode.next=head;
        //make new node as head
        head=newNode;
        

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        Node temp=head;
        if(temp==null){
            System.out.println("LinkedList is Empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        Node temp=head;
        if(temp==null){
            addFirst(data);
            return;
        }
        Node newNode =new Node(data);
        size++;
       
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;


    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty.");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }else{
        int val=head.data;
        head=head.next;
        size--;
        return val;
        }
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LinkedList is empty.");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }else{
        Node prev=head;
        for(int i=0;i<size-2;i++){
             prev =prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    }

    public int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
          if(temp.data==key){
            return i;
          }
          temp=temp.next;
          i++;
        }
        return Integer.MIN_VALUE;
    }

     public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
     }

    public int recSearch(int key){
        return helper( head,key);
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr =next;
        }
        head=prev;
    }
    public void removeNthFromEnd(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int itoFind=sz-n;
        Node prev=head;
        while(i<itoFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMidNode(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean isPallindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //find midNode
        Node mid=findMidNode();
        //reverse the secondHalf
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;


        //check first half with second half
       while(right.next!=null){
        if(left.data!=right.data){
            return false;
        }
        right=right.next;
        left=left.next;
       }
       return true;
    }
    //Detect acycle in LL
    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    //Remove cycle from LL
    public void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean isCycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCycle=true;
            }
        }
        if(isCycle==false){
            return;
        }
         
        slow=head;
        Node prev=null;
        while(slow!=head){
           prev=fast;
           slow=slow.next;
           fast=fast.next;
        }
        prev.next=null;
    }
    public void Zigzag(){
        //finding the midNode
        Node mid=findMidNode();
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        //reversing the second half
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        Node nextL ,nextR;
        
        while(left!=null&&right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }


    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
         
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.add(4, 5);
        //ll.print();
        //System.out.println(size);
        // System.out.println(ll.removeFirst()+" removed from LinkedList");
        
        // System.out.println(ll.removeLast()+" removed from LinkedList");
        // System.out.println(size);
        // System.out.println("key found at index:"+ ll.iterativeSearch(3));
        // System.out.println("key found at index:"+ ll.iterativeSearch(10));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.removeNthFromEnd(3);
        // ll.print();

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(1);
        //ll.addLast(1);
        // ll.print();
       // System.out.println(ll.isPallindrome());
       ll.Zigzag();
       ll.print();

    }
}
