package com.company;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("банан");
        queue.add("яблоко");
        queue.add("ананас");
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.add("банан");
        queue1.add("яблоко");
        queue1.add("ананас");
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }


    }
}

