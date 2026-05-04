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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>l=new ArrayList<>();
        for(ListNode ll:lists){
            while(ll!=null){
                l.add(ll.val);
                ll=ll.next;
            }
        }
        Collections.sort(l);
        ListNode temp=new ListNode(-1);
        ListNode head=temp;
        for(int i:l){
            head.next=new ListNode(i);
            head=head.next;
        }
        return temp.next;
    //     PriorityQueue<Integer>minheap=new PriorityQueue<>();
    //     for(ListNode ll:lists){
    //         while(ll!=null){
    //             minheap.offer(ll.val);
    //             ll=ll.next;
    //         }
    //     }
    //     ListNode temp=new ListNode(-1);
    //     ListNode head=temp;
    //     while(!minheap.isEmpty()){
    //         head.next=new ListNode(minheap.poll());
    //         head=head.next;
    //     }
    //     return temp.next;
    }
}
