package Alberano;

import java.util.Scanner;

public class Q21 {

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

        public static Q21 insert(Q21 list, int data)
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

        public static void printList(Q21 list)
        {
            Node currNode = list.head;

            System.out.print("LinkedList: ");

            while (currNode != null) {

                System.out.print(currNode.data + " ");

                currNode = currNode.next;
            }
        }

    static Q21 rearrangeEvenOdd(Q21 list)
    {
        if (list.head == null)
            return null;
        Node odd = list.head;
        Node even = odd.next;

        Node evenFirst = even;

        while (1 == 1)
        {
            if (odd == null || even == null ||
                    (even.next) == null)
            {
                odd.next = evenFirst;
                break;
            }
            odd.next = even.next;
            odd = even.next;

            if (odd.next == null)
            {
                even.next = null;
                odd.next = evenFirst;
                break;
            }

            even.next = odd.next;
            even = odd.next;
        }
        return list;
    }

        public static void main(String[] args)
        {
           int data;
            Q21 list = new Q21();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no of nodes for the list: ");
            int node_no=sc.nextInt();
            System.out.println("Enter the elements for the list: ");

            for(int i=0;i<node_no;i++){
                list=insert(list,data=sc.nextInt());
            }
            list=rearrangeEvenOdd(list);
            printList(list);
        }
    }

