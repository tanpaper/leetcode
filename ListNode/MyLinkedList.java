package ListNode;

import java.util.LinkedList;

/**
 *
 * @author tanxianchao
 */
class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        this.size=0;
        this.head=null;
    }
    public int get(int index) {
        if(index<0||index>size){
            return -1;
        }
        ListNode dumy = new ListNode(-1,this.head);
        while(index!=1){
            dumy=dumy.next;
            index--;
        }
        return dumy.next.val;
    }

    public void addAtHead(int val) {
        ListNode dumy = new ListNode(-1,this.head);
        ListNode newNode = new ListNode(val,null);
        newNode.next = this.head;
        dumy.next=newNode;
        this.size++;
    }

    public void addAtTail(int val) {
        ListNode indexNode = new ListNode(-1,this.head);
        ListNode newNode = new ListNode(val,null);
        while(indexNode.next!=null){
            indexNode=indexNode.next;
        }
        indexNode.next=newNode;
        this.size++;
    }

    public void addAtIndex(int index, int val) {
        ListNode indexNode = new ListNode(-1,this.head);
        ListNode preIndexNode = head;
        ListNode newNode = new ListNode(val);
        while(index!=0){
            indexNode=indexNode.next;
            preIndexNode=preIndexNode.next;
            index--;
        }
        newNode.next=preIndexNode;
        indexNode.next=newNode;
        this.size++;
    }

    public void deleteAtIndex(int index) {
        ListNode indexNode = new ListNode(-1,this.head);
        while(index!=0){
            indexNode=indexNode.next;
            index--;
        }
        indexNode.next=indexNode.next.next;
    }
}
