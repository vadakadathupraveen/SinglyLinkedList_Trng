public class SinglyLinkedListDeleteLastNode {
    private LinkNode head;

    private static class LinkNode {
        private int data;
        private LinkNode next;

        private LinkNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListDeleteLastNode sl = new SinglyLinkedListDeleteLastNode();
        sl.head = new LinkNode(1);
        LinkNode second = new LinkNode(2);
        LinkNode third = new LinkNode(3);
        LinkNode fourth = new LinkNode(4);

        sl.head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println("Present Linked List");
        sl.display();

        System.out.println("Removing last node : "+ sl.removeLastNode().data);
        sl.display();

    }

    public LinkNode removeLastNode() {
        //1--2--3--4
        if (head == null || head.next == null) {
            return null;
        } else {
            LinkNode leadP = head;
            LinkNode lagP = null;
            while (leadP.next != null) {
                lagP = leadP;
                leadP = leadP.next;
            }
            lagP.next = null;
            return leadP;
        }
    }


    public void display() {
        LinkNode tp = head;
        while (tp != null) {
            System.out.print(tp.data + " --> ");
            tp = tp.next;
        }
        System.out.print("null\n");
    }

}
