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
    public boolean isPalindrome(ListNode head) {
        List<Integer> ans=new ArrayList<>();

        if(head == null || head.next==null)
            return true;

        ListNode curr = head;
        while(curr!=null){
            ans.add(curr.val);
            curr = curr.next;
        }

        int i=0, j= ans.size()-1;
        while(i<=j){
            if(!ans.get(i++).equals(ans.get(j--)))
                return false;
        }
        return true;
    }
}