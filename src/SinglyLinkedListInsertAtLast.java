public class SinglyLinkedListInsertAtLast {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null\n");
    }

    public static void main(String[] args) {
        SinglyLinkedListInsertAtLast sll = new SinglyLinkedListInsertAtLast();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        sll.insertToTheEnd(7);
        sll.insertToTheEnd(8);

    }

    public void insertToTheEnd(int i) {
        ListNode toInsert = new ListNode(i);

        if (head ==null){
            head.next = toInsert;
            return;

        }

        ListNode ir = head;
        while (ir.next != null) {
            ir = ir.next;
        }
        ir.next = toInsert;
        display();
    }
}
