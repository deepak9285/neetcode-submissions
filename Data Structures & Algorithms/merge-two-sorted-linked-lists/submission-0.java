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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode templist1=list1;
        ListNode templist2=list2;
        while(templist1!=null&&templist2!=null){
            if(templist1.val<templist2.val){
                temp.next=templist1;
                temp=temp.next;
                templist1=templist1.next;
            }else{
                temp.next=templist2;
                temp=temp.next;
                templist2=templist2.next;
            }
        }
       if(templist1!=null){
        temp.next=templist1;
       }else temp.next=templist2;
        return dummy.next;
    }
}