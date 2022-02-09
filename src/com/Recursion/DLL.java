package com.Recursion;
import java.util.*;

public class DLL {

    private Node head;
    // insertion at the first place of a linkedlist.
    public void insertFirst(int value){
        Node node = new Node(value);
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
        while(node!=null){
            System.out.print(node.value+"--> ");
            node = node.next;
        }
        System.out.println("End");
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
