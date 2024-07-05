import java.util.*;
class ListNode{
  int val;
  ListNode next;
  ListNode(int val){
    this.val = val;
  }
}
class MergeTwo{
 public static void main(String [] args){
 int[]  list1 = {1,2,4};
 int[] list2 = {1,3,4};
  ListNode head1 =  createLinkedList(list1);
    ListNode head2 =  createLinkedList(list2);

  ListNode result =MergeTwoList( head1, head2);
  printList(result);
 }
 public static ListNode MergeTwoList(ListNode list1,ListNode list2){
  ListNode t1 = list1;
  ListNode t2 = list2;
  ListNode dummyNode  = new ListNode(-1);
  ListNode temp = dummyNode;
  while(t1!=null && t2!=null){
    if(t1.val<t2.val){
      temp.next = t1;
      t1 = t1.next;
    }
    else{
      temp.next = t2;
      t2 = t2.next;
    }
  temp = temp.next;
  }
  if(t1!=null){
    temp.next = t1;
  }
  else{
    temp.next = t2;
  }
  return dummyNode.next;
 }
 public static ListNode  createLinkedList(int[] list){
  
  ListNode head = new ListNode(list[0]);
  ListNode current  = head;
  for(int i=1;i<list.length;i++){
    current.next  = new ListNode(list[i]);
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
