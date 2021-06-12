package Alberano;

import java.util.Scanner;

public class Q45 {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Q45 insert(Q45 list, int data)
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


    public static void printList(Q45 list)
    {
       Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

   static void removeDuplicates(Q45 list)
    {
        Node curr = list.head;


        while (curr != null) {
            Node temp = curr;

            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }
public static void main(String []args){
    int data;
    Q45 list = new Q45();
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

    removeDuplicates(list);
    printList(list);
}
}
