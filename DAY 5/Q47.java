package Alberano;

import java.util.Scanner;

public class Q47 {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Q47 insert(Q47 list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void printList(Q47 list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    static boolean ispalindrome(Q47 list, int n) {
        Node temp = list.head;

        int[] num = new int[n];
        int i = 0, count = 0;
        while (temp != null) {
            num[i++] = temp.data;
            temp = temp.next;
        }
        temp = list.head;
        while (temp != null) {
            if (num[--i] == temp.data)
                count++;
            temp = temp.next;
        }
        return count == n;
    }

    public static void main(String[] args) {
        int data;
        Q47 list = new Q47();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of nodes for the list: ");
        int node_no = sc.nextInt();
        System.out.println("Enter the elements for the list: ");

        for (int i = 0; i < node_no; i++) {
            list = insert(list, data = sc.nextInt());
        }

        System.out.println(ispalindrome(list, node_no));
    }
}
