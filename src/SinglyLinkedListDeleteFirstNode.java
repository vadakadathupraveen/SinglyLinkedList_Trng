public class SinglyLinkedListDeleteFirstNode {
    private LinkNode head;

    private static class LinkNode {
        private int data;
        private LinkNode next;

    private LinkNode(int data){
        this.data = data;
        this.next = null;
    }

        public static void main(String[] args) {
            SinglyLinkedListDeleteFirstNode sl = new SinglyLinkedListDeleteFirstNode();
            sl.head = new LinkNode(1);
            LinkNode second = new LinkNode(2);
            LinkNode third = new LinkNode(3);
            LinkNode fourth = new LinkNode(4);

            sl.head.next = second;
            second.next = third;
            third. next = fourth;

            System.out.println("Given Linked List");
            sl.display();

            System.out.println("Removed : "+sl.deleteFirstNode().data);
            sl.display();
        }
    }

    public LinkNode deleteFirstNode() {
        if (head == null){
            return null;
        }
        else {
            LinkNode temp = head;
            head = head.next;
            // this is used to explicity remove the old head of any references to the new linked list
            // preventing memory leaks and making the prev node eligible for garbage collection
           temp.next = null;
           return temp;
        }
    }

    public void display() {
        LinkNode cur = head;
        while (cur.next!=null){
            System.out.print(cur.data+" --> ");
            cur = cur.next;
        }
        System.out.print("null\n");
    }
}
