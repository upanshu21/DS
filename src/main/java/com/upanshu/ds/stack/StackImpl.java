package com.upanshu.ds.stack;

public class StackImpl {

    int top;
    int[] stack = new int[1000];
    StackImpl() {
        top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int element) {
        if(top >= 999) {
            System.out.println("stack overflow");
        } else {
            stack[++top] = element;
        }
    }

    public int pop() {
        return stack[--top];
    }

    public void peek() {
        if(top < 0) {
            System.out.println("empty");
        } else {
            int result =  stack[top];
            System.out.println(result);
        }
    }

    public void display() {
        for(int element: stack) {
            if(element != 0) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.peek();
        stack.display();
    }
}
