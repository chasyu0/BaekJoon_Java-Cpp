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
        ListNode node = new ListNode(0);
        ListNode result = node;
        int sum = 0;

        while(l1 != null || l2 != null || sum > 0) {

            if (l1 != null) {
                sum += l1.val; 
                l1 = l1.next; // 다음노드 이동
            } 

            if(l2 != null) {
                 sum += l2.val;
                l2 = l2.next;
            }

                node.next = new ListNode(sum % 10); // 나머지
                sum /= 10; // 나누기

                node = node.next;
            }

        return result.next; 
    }
}