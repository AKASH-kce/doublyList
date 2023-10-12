package doublyList;

public class main {
    public static void main(String[] args) {
        // Create an empty doublyLinkedList
        doublyLinkedList myList = new doublyLinkedList();

        // Insert elements at the end
        myList = doublyLinkedList.insert(myList, 1);
        myList = doublyLinkedList.insert(myList, 2);
        myList = doublyLinkedList.insert(myList, 3);

        // Insert an element at the beginning
        myList = doublyLinkedList.insertAtbeg(myList, 0);

        // Insert an element at a specific position
        myList = doublyLinkedList.insertAtPos(myList, 4, 2);

        // Delete an element from the beginning
        myList = doublyLinkedList.delettAtbeg(myList);

        // Delete an element from the end
        myList = doublyLinkedList.delettAtEnd(myList);

        // Delete an element from a specific position
        myList = doublyLinkedList.insertAtPos(myList, 3, 1);

        // Reverse the doubly linked list
        myList = doublyLinkedList.reverseList(myList);

        // Print the linked list
        doublyLinkedList.printList(myList);
    }
}