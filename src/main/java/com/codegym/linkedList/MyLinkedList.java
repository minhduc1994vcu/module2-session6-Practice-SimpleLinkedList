package com.codegym.linkedList;

public class MyLinkedList {
    private Node head;
    private int numNode;

    public MyLinkedList(Object data) {
        this.head = new Node(data);

    }

    public void add(int index, Object data) {
        Node tail = head;
        Node holder;

        for (int i = 0; i < index - 1 && tail.next != null; i++) {
            tail = tail.next;
        }
        holder = tail.next;
        tail.next = new Node(data);
        tail.next.next = holder;
        numNode++;
    }

    public void addFirst(Object data) {
        Node tail = head;
        head = new Node(data);
        head.next = tail;
        numNode += 1;
    }

    public Node get(int index) {
        Node tail = head;
        for (int i = 0; i < index; i++) {
            tail = tail.next;
        }
        return tail;
    }

    public void printList() {
        Node tail = head;
        while (tail != null) {
            System.out.println(tail.data);
            tail = tail.next;
        }
    }
}
