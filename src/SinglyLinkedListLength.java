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

    public void displaylength() {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("\nLength of the ListNode :" + length);
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

        sl.displaylength();

    }
}
