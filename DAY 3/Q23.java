package Alberano;

import java.util.Scanner;

public class Q23 {

    Node head;
    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static Q23 insert(Q23 list, int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }
        else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void printList(Q23 list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    static Q23 swap_end(Q23 list)
    {
        if (list.head == null)
            return null;

        Node prev = list.head, curr = list.head.next;

        while (curr != null) {

            if (prev.data > curr.data) {
                int t = prev.data;
                prev.data = curr.data;
                curr.data = t;
            }

            if (curr.next != null
                    && curr.next.data > curr.data) {
                int t = curr.next.data;
                curr.next.data = curr.data;
                curr.data = t;
            }

            prev = curr.next;

            if (curr.next == null)
                break;
            curr = curr.next.next;
        }
        return list;
    }

    public static void main(String args[]){
        int data;
        Q23 list = new Q23();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of nodes for the list: ");
        int node_no=sc.nextInt();
        System.out.println("Enter the elements for the list: ");

        for(int i=0;i<node_no;i++){
            list=insert(list,data=sc.nextInt());
        }

        System.out.println("before swapping");
        printList(list);
        System.out.println("\n after swapping");
        list=swap_end(list);

        printList(list);
    }
}
