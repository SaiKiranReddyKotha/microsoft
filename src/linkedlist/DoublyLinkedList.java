package linkedlist;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {

        int data;
        ListNode previous;
        ListNode next;

        private ListNode(int data) {
            this.data = data;
        }

    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length ==0; //head == null
    }

    public int length() {
        return length;
    }

    public void insertAtFirst(int data) {
        ListNode node = new ListNode(data);

        if(isEmpty()) {
            tail = node;
        }else {
            head.previous = node;
        }
        node.next = head;
        head = node;
        length++;
    }

    public void insertAtLast(int data) {
        ListNode node = new ListNode(data);

        if(isEmpty()) {
            tail = node;
            head = node;
        } else {
            node.previous = tail;
            tail.next = node;
            node.next = null;
            tail = node;
        }
        length++;
    }

    public void deleteAtFirst () {
        if (isEmpty()) {
            return;
        } else {
            head = head.next;
            head.previous = null;
        }
        length--;
    }

    public void deleteAtLast() {
        if(isEmpty()) {
            return;
        } else {
            if (tail.previous != null) {
                tail = tail.previous;
                tail.next = null;
            } else {
                tail = null;
            }
        }
        length--;
    }

    public void insertAt(int index, int data) {
        if(isEmpty()) {
            return;
        }
        if(index<0 || index>length ) {
            return;
        }

        if(index == 0) {
            insertAtFirst(data);
            return;
        }
        if( index == length ) {
            insertAtLast(data);
            return;
        }else {
            ListNode node = new ListNode(data);
            ListNode n = head;
            for(int i=1; i<index; i++) {
                n = n.next;
                if(n.next == null) {
                    return;
                }
            }
            node.next = n.next;
            node.previous = n;
            node.next.previous = node;
            n.next = node;
            length++;
        }

    }

    public void deleteAt(int index) {
        if(isEmpty()) {
            return;
        }
        if (index <= 0 || index>length) {
            return;
        }
            ListNode n = head;
            for(int i=1;i<index;i++){
                n = n.next;
            }
            if(n.next == null) {
                deleteAtLast();
                return;
            } else if (n.previous == null) {
                deleteAtFirst();
                return;
            } else {
                n.previous.next = n.next;
                n.next.previous = n.previous;
            }
            length--;

    }

    public void showForward() {

        ListNode node = head;
        if (isEmpty()) {
            System.out.println("The list is empty");
        } else {
            while (node.next != null) {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
            System.out.println("length :" + length);
        }
    }

    public void showBackward() {

        ListNode node = tail;
        while(node.previous != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
