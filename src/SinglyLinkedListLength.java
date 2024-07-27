public class SinglyLinkedListLength {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public int displaylength() {
        if (head == null) {
            return 0;
        }
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null\n");
        return length;
    }


    public static void main(String[] args) {
        SinglyLinkedListLength sl = new SinglyLinkedListLength();
        sl.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        sl.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Length of LinkedList: " + sl.displaylength());

    }
}
