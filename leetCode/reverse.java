class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val = val;
  }
}
class reverse{
  public static void main(String [] args){
    int [] values={1,2,3,4,5};
  ListNode head = createLinkedList( values);
 ListNode result=reverseList( head);
  printList(result);
  }
  public static ListNode reverseList(ListNode head){
    if(head==null || head.next==null){
      return head;
    }
    ListNode newHead = reverseList(head.next);
     ListNode front = head.next;
     front.next = head;
     head.next = null;
     return newHead;
    }
    public static ListNode createLinkedList(int[] values){
      ListNode head = new ListNode(values[0]);
      ListNode current = head;
      for(int i=1;i<values.length;i++){
        current.next = new ListNode(values[i]);
        current = current.next;
      }
      return head ;

    }
    public static void printList(ListNode head){
      ListNode current = head;
      while(current!=null){
        System.out.println(current.val+" ");
        current = current.next;
      }
      System.out.println();
    }

}