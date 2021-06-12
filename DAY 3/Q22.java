package Alberano;

import java.util.Scanner;

public class Q22 {
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

    public static Q22 insert(Q22 list, int data)
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

    public static Q22 swap(Q22 list){
        Node temp = list.head;

        while (temp != null && temp.next != null)
        {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
        return list;
    }

    public static void printList(Q22 list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    public static void main(String args[]){
        int data;
        Q22 list = new Q22();
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
        list=swap(list);

        printList(list);
    }

}
