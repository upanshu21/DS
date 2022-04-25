package com.upanshu.ds.linkedList;

public class LinkedList {

    Node head;
    Node tail;

    static class Node{
        int data;
        Node addressOfNextNode;

        Node(int data) {
            this.data = data;
            this.addressOfNextNode = null;
        }

    }

    public void addElement(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            tail.addressOfNextNode = newNode;
        }
        tail = newNode;
        tail.addressOfNextNode = null;
    }

    public void addElementToHead(int data) {
        Node next = head;
        head = new Node(data);
        head.addressOfNextNode = next;
    }

    public void displayElements() {
        Node currentNode = head;
        if(head == null) {
            System.out.println("empty");
        }
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.addressOfNextNode;
        }
    }

//    public void deleteElement(int element) {
//        Node node = head;
//       for(int index = 0; node.)
//    }

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addElement(1);
        a.addElement(2);
        a.addElementToHead(4);
        a.addElementToHead(5);
        System.out.println(a.tail.addressOfNextNode);
        a.displayElements();
    }
}
