public class SinglyLinkedListInsertAtFirst {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
        this.data = data;
        this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListInsertAtFirst sll = new SinglyLinkedListInsertAtFirst();
        sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        //insert elements at the first position
        sll.insertToFirst(5);
        sll.insertToFirst(444444444);
    }

    public void insertToFirst(int i) {
        ListNode toFirst = new ListNode(i);
        toFirst.next = head;
        head = toFirst;
        display();
    }

    public void display() {
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.print("null\n");

    }
}
