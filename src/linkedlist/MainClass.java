package linkedlist;


public class MainClass {

    public static void main(String[] args) {

//        Enable Internal Implementation of LinkedList
//        LinkedList list = new LinkedList();
//
//        list.add(5);
//        list.add(3, 12);

//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insert(5);
//        list.insert(12);
//        list.insert(6);
//        list.insert(9);
//        list.insert(8);
//        list.insertAtStart(25);
//        list.insertAt(2, 55);
//        list.deleteAt(5);
//        list.show();

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtFirst(2);
        doublyLinkedList.insertAtFirst(10);
        doublyLinkedList.insertAtLast(20);
        doublyLinkedList.insertAtFirst(5);
        doublyLinkedList.insertAtLast(30);
        doublyLinkedList.deleteAtFirst();
        doublyLinkedList.deleteAtLast();
        doublyLinkedList.insertAt(2, 9);
        doublyLinkedList.showForward();
        doublyLinkedList.deleteAt(0);
        doublyLinkedList.showForward();
    }
}
