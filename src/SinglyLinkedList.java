public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(1);
//        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);


        sll.head.next = second;  // 1 --> 2
        second.next = third; // 1 --> 2 --> 3
        third.next = fourth; // 1 --> 2 --> 3 -->4


     sll.display();
    }

    //print the elements of the list
    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.print("null");
    }


}
