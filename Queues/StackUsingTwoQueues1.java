package Queues;

import java.util.*;

public class StackUsingTwoQueues1 {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        //push - O(n)
        public static void push(int data){
            q2.add(data);
            
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }

            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        //pop - O(1)
        public static int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q1.remove();
        }

        //peek - O(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
