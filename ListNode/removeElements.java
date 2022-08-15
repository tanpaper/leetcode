package ListNode;
/*
*给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
* https://leetcode.cn/problems/remove-linked-list-elements/
* */
public class removeElements {
    //方法1
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode dumn = new ListNode(-1,head);
        ListNode cur = new ListNode();
        ListNode pre = new ListNode();
        cur = head;
        pre = dumn;
        while(cur != null){
            if(cur.val == val){
                pre.next=cur.next;
            }else{
                pre = cur;
            }
            cur=cur.next;
        }
        return dumn.next;
    }
    //方法2
    public ListNode removeElements2(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode dumn = new ListNode(-1,head);
//        ListNode cur = new ListNode();
        ListNode pre =new ListNode();
//       cur = head;
        pre = dumn;
        while( pre.next != null){
            if(pre.next.val == val){
                pre.next=pre.next.next;
            }
            //    }else{
            //        pre = cur;
            //    }
            else{
                pre=pre.next;
            }
        }
        return dumn.next;
    }
}
