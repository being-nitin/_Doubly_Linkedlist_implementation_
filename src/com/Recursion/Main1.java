package com.Recursion;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.display();
        list.insertLast(67);
        list.display();
    }
}
