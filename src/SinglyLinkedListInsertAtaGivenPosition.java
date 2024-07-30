public class SinglyLinkedListInsertAtaGivenPosition {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode cur = head;
        while (cur != null){
            System.out.print(cur.data +" --> ");
            cur = cur.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
    SinglyLinkedListInsertAtaGivenPosition sll = new SinglyLinkedListInsertAtaGivenPosition();
    sll.head = new ListNode(1);

    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);

    sll.head.next = second;
    second.next = third;
    third.next = fourth;

    System.out.println("Given linked list");
    sll.display();

   sll.insertAtGivenPos(7,3);
    }

    public void insertAtGivenPos(int e, int pos) {
        ListNode toInsert = new ListNode(e);
if (pos==1){
    toInsert.next = head;
    head = toInsert;
}
else{
    ListNode prevNode = head;
    int count = 1;
    while (count < pos -1){
        prevNode = prevNode.next;
        count++;
    }
    ListNode rest = prevNode.next;
    toInsert.next = rest;
    prevNode.next = toInsert;
}
        System.out.println("Linked list after insertion");
display();
    }
}
