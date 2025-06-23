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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        // ListNode temp=head;
        // int l=0;
        // while(temp!=null){
        //     l++;
        //     temp=temp.next;
        // }
        // int c=0;
        // //ListNode cur=head;
        // if(l%2!=0){
        //     while(c!=l/2){
        //         head=head.next;
        //         c++;
        //     }
        // }
        // else{
        //     while(c!=l/2){
        //         head=head.next;
        //         c++;
        //     }
        //     //head=head.next;
        // }
        // return head;
    }
}