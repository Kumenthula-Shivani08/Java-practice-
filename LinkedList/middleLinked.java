import java.util.*;
class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val =val;
  }
}
class middleLinked{
  public static void main(String [] args){
    int [] values = {1,2,3,4,5};
    ListNode head =  createLinkedList(values);
    ListNode result =  MiddleLinkedList(head);
    printList(result);
  }
  public static ListNode MiddleLinkedList(ListNode head){
    ListNode fast = head;
    ListNode slow = head;
     while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;

     }
     return slow;
  }
  public static ListNode createLinkedList(int [] values){
    ListNode head = new ListNode(values[0]);
    ListNode current = head;
    for(int i=1;i<values.length;i++){
      current.next = new ListNode(values[i]);
      current = current.next;
    }
    return head;
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