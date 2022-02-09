package com.Recursion;
import java.util.*;

public class DLL {

    private Node head;
    // insertion at the last place of a linkedlist

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next =null;
        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }
    // insertion at the first place of a linkedlist
    public void insertFirst(int value){
        Node node = new Node(value);  // This means that we are creating a box node
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    // to display the content.
    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value+"--> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        // displaying the linkedlist in reverse.
        while(last!=null){
            System.out.print(last.value+"--> ");
            last = last.prev;
        }
        System.out.println("end");
    }
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
