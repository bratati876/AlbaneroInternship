package Alberano;

import java.util.Scanner;

public class Linkedlist {
    Node head;


    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void removeDuplicates() {

        Node curr = head;


        while (curr != null) {
            Node temp = curr;

            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);

        new_node.next = head;
        head = new_node;
    }
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
class driver{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            Linkedlist llist = new Linkedlist();
            System.out.println("how many elements you wanna push ?");
            int n=sc.nextInt();
            System.out.println("\t\tEnter the elements....");
            for(int i=0;i<n;i++) {
                int element=sc.nextInt();
                llist.push(element);
            }

            System.out.println("List before removal of duplicates");
            llist.printList();

            llist.removeDuplicates();

            System.out.println("List after removal of elements");
            llist.printList();
        }
    }

