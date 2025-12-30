import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    private Node head;

    // Function to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Function to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty, cannot delete.");
            return;
        }

        // If the node to be deleted is the head node
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found in the list.");
        } else {
            temp.next = temp.next.next;
        }
    }

    // Function to display the linked list
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

// Main class
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Delete by value");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at beginning: ");
                    value = scanner.nextInt();
                    list.insertAtBeginning(value);
                    break;

                case 2:
                    System.out.print("Enter value to insert at end: ");
                    value = scanner.nextInt();
                    list.insertAtEnd(value);
                    break;

                case 3:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    list.deleteByValue(value);
                    break;

                case 4:
                    list.displayList();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
