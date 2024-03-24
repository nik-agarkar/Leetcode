/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode curr=head, prev=null, currNext=head;
        while(curr!=null){
            currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;    
        }
        return prev;
    }
}

/*



<- 1  2 -> 3 -> 4
  p   c    n

  */