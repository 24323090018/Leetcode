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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry =0;
        
        while(l1!=null || l2!=null || carry==1){
            int sum = 0;
            if(l1!=null){
                sum += l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum += carry;
            // int x = p!=null ? p.val :0;
            // int y = q!=null ? q.val :0;
            // int sum = x + y + carry;
            carry = sum/10;
            ListNode node = new ListNode(sum%10);
            temp.next = node;
            temp=temp.next;
            
            // if(l1!=null) l1 = l1.next;
            // if(l2!=null) l2 = l2.next;
        }
        
        // if(carry>0){
        //     temp.next = new ListNode(carry);
        // }
        
        return dummy.next;
    }
}