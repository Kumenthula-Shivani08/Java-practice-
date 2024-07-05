import java.util.*;
class ListNode {
  int val;
  ListNode next;
  ListNode(int val){
    this.val = val;
  }
}
class DeleteNthNode{
  public static void main(String [] args ){
  int[] values = {1,2,3,4,5};
  ListNode head = createLinkedList(values);
  int  n = 2;
  ListNode result = removeNthNode( n, head );
  printList(result);
  }
  public static ListNode removeNthNode(int n,ListNode head ) {
    ListNode fast = head;
    ListNode slow = head;
    for(int i=0;i<n;i++){
    fast = fast.next;
    }
    if(fast == null){
      return head.next;
    }
    while(fast.next!=null){
     fast=fast.next ;
     slow =slow.next;
    }
    ListNode delNode = slow.next;
    slow.next = slow.next.next;
    return head;
  }
  public static ListNode createLinkedList(int[] values){
    ListNode head = new ListNode(values[0]);
   ListNode  current = head;
   for(int i=1;i<values.length;i++){
    current.next =new ListNode(values[i]);
    current=current.next;
   }
   return head;
  }
  public static void printList(ListNode head){
    ListNode current =head;
    while(current!=null){
      System.out.println(current.val+" ");
      current = current.next;
    }
    System.out.println();
  }
}