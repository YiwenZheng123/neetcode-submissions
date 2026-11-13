class ListNode {
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
public class MyLinkedList {

    private int size;
    private ListNode dummy;

    public MyLinkedList() {
        size = 0;
        dummy = new ListNode(0);
        
    }
    
    public int get(int index) {
        if (index >= size){
            return -1;
        }
        ListNode curr = dummy.next;
        for (int i = 0; i < index;i++){
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = dummy.next;
        dummy.next = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode curr = dummy;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size ) return;
        ListNode newNode = new ListNode(val);
        ListNode curr = dummy;

        while (index > 0){
            curr = curr.next;
            index --;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;

        
    }
    
    public void deleteAtIndex(int index) {
        if (index >= size ) return;
        ListNode curr = dummy;
        while (index > 0){
            curr = curr.next;
            index--;
        }
        curr.next = curr.next.next;
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */