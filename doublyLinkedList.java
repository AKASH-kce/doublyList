// doublyLinkedList.java
package doublyList;

public class doublyLinkedList {
    node head;

    public static doublyLinkedList insert(doublyLinkedList ll, int data) {
        node new_node = new node();
        new_node.data = data;

        if (ll.head == null) {
            ll.head = new_node;
        } else {
            node temp = ll.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.prev = temp;
        }
        return ll;
    }

    public static doublyLinkedList insertAtbeg(doublyLinkedList ll, int data) {
        node new_node = new node();
        new_node.data = data;

        if (ll.head == null) {
            ll.head = new_node;
        } else {
            node temp = ll.head;
            new_node.next = temp;
            temp.prev = new_node;
            new_node.prev = null;
            ll.head = new_node;
        }
        return ll;
    }

    public static doublyLinkedList insertAtEnd(doublyLinkedList ll, int data) {
        node new_node = new node();
        new_node.data = data;

        if (ll.head == null) {
            ll.head = new_node;
        } else {
            node temp = ll.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.prev = temp;
        }
        return ll;
    }

    public static doublyLinkedList insertAtPos(doublyLinkedList ll, int data, int pos) {
        if (pos == 0) {
            return insertAtbeg(ll, data);
        } else {
            node new_node = new node();
            new_node.data = data;

            node temp = ll.head;
            for (int i = 0; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                return ll; // Position not found
            }
            new_node.next = temp.next;
            temp.next = new_node;
            new_node.prev = temp;
            if (new_node.next != null) {
                new_node.next.prev = new_node;
            }
            return ll;
        }
    }

    public static doublyLinkedList delettAtbeg(doublyLinkedList ll) {
        if (ll.head == null) {
            return ll;
        } else {
            node temp = ll.head;
            node next_node = temp.next;
            temp.next = null;
            next_node.prev = null;
            ll.head = next_node;
        }
        return ll;
    }

    public static doublyLinkedList delettAtEnd(doublyLinkedList ll) {
        if (ll.head == null) {
            return ll;
        } else {
            node temp = ll.head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        return ll;
    }

    public static doublyLinkedList deletAtPos(doublyLinkedList ll, int pos) {
        if (pos == 0) {
            return delettAtbeg(ll);
        } else {
            node temp = ll.head;
            for (int i = 0; i < pos && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                return ll; // Position not found
            }
            temp.prev.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            }
            return ll;
        }
    }

    public static doublyLinkedList reverseList(doublyLinkedList ll) {
        node prev = null;
        node current = ll.head;
        while (current != null) {
            node next_node = current.next;
            current.next = prev;
            current.prev = next_node;
            prev = current;
            current = next_node;
        }
        ll.head = prev;
        return ll;
    }

    public static void printList(doublyLinkedList ll) {
        node current = ll.head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
