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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            if(fast.val==fast.next.val){
                fast.next=fast.next.next;
            }else{
                fast=fast.next;
            }
        }
        return head;
    }
}

