package Alberano;

import java.util.Scanner;

public class Q42 {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static Q42 insert(Q42 list, int data)
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

   static Q42 reverse(Q42 list)
    {
        Node prev = null;
        Node cur= list.head;
        Node next = null;

        if(cur == null)
            return null;
        while (cur != null) {
            next = cur.next;
             cur.next = prev;
            prev = cur  ;
            cur = next;
        }
        list.head = prev;
        return list;
    }

    public static void printList(Q42 list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }


    public static void main(String []args){
        int data;
        Q42 list = new Q42();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of nodes for the list: ");
        int node_no=sc.nextInt();
        System.out.println("Enter the elements for the list: ");

        for(int i=0;i<node_no;i++){
            list=insert(list,data=sc.nextInt());
        }

        System.out.println("before reversing the list ");
        printList(list);
        System.out.println("\nafter reversing the list ");

        list=reverse(list);
        printList(list);
    }

}
