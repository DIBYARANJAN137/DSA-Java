 public class swapTwoNodes {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void swapNodes(int x, int y) {
        if (x == y) return;

        Node prevx = null, currx = head;
        while (currx != null && currx.data != x) {
            prevx = currx;
            currx = currx.next;
        }

        Node prevy = null, curry = head;
        while (curry != null && curry.data != y) {
            prevy = curry;
            curry = curry.next;
        }

        // If either node not found, return
        if (currx == null || curry == null) return;

        // Rewire previous nodes
        if (prevx != null) {
            prevx.next = curry;
        } else {
            head = curry;
        }

        if (prevy != null) {
            prevy.next = currx;
        } else {
            head = currx;
        }

        // Swap next pointers
        Node temp = currx.next;
        currx.next = curry.next;
        curry.next = temp;
    }

    public static void main(String[] args) {
        swapTwoNodes ll = new swapTwoNodes();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        System.out.println("Original list:");
        ll.printList();

        int x = 2, y = 4;
        ll.swapNodes(x, y);

        System.out.println("List after swapping " + x + " and " + y + ":");
        ll.printList();
    }
}
