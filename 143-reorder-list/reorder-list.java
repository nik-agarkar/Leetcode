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
    public void reorderList(ListNode head) {
        List<ListNode> arr=new ArrayList<>();
        if(head==null)
            return;

        ListNode curr = head;
        ListNode newHead = new ListNode(0);

        while(curr!=null){
            arr.add(curr);
            curr = curr.next;
        }

        int i=0,n=arr.size()-1;
        curr = newHead;
        while(i<=n){
            curr.next = arr.get(i++);
            curr = curr.next;
            curr.next = arr.get(n--);
            curr = curr.next;
        }
        curr.next = null;
        return;
    }
}