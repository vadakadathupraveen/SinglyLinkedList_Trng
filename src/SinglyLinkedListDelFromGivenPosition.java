public class SinglyLinkedListDelFromGivenPosition {
    private LinkNode head;

    private static class LinkNode {
        private int data;
        private LinkNode next;

        public LinkNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListDelFromGivenPosition sl = new SinglyLinkedListDelFromGivenPosition();
        sl.head = new LinkNode(1);
        LinkNode second = new LinkNode(2);
        LinkNode third = new LinkNode(3);
        LinkNode fourth = new LinkNode(4);

        sl.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Present Linked List");
        sl.display();

        System.out.println("Removing: " + sl.removeNodeAt(3).data);
        sl.display();
    }

    public LinkNode removeNodeAt(int pos) {

        LinkNode tmp = head;
        if (pos == 1) {
            head = head.next;
            tmp.next = null;
            return tmp;
        } else {

            int count = 1;
            while (count < pos - 1) {
                tmp = tmp.next;
                count++;
            }
            LinkNode node2del = tmp.next;
            tmp.next = node2del.next;
            node2del.next = null; // to help with garbage collection
            return node2del;

        }
    }

    public void display() {
        LinkNode tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " --> ");
            tmp = tmp.next;
        }
        System.out.print("null\n");
    }
}
