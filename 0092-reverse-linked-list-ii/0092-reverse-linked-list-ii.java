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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev = null;
        ListNode curr = head;
        int i;
        for(i = 1;i<left;i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode revHead = curr;
        ListNode revTail = null;
        ListNode nextNode = null;
        while(i <= right){
            nextNode = curr.next;
            curr.next = revTail;
            revTail = curr;
            curr = nextNode;
            i++;
        }
        if(prev != null){
            prev.next = revTail;
        }
        else{
            head = revTail;
        }
        revHead.next = curr;
        return head;
        
    }
}