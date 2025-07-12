package Queues;

import java.util.Stack;

public class QueueUsingTwoStacks1 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add - O(1)
        public static void add(int data){
            s1.push(data);
        }
        //remove - O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            while(!isEmpty()){
                s2.push(s1.pop());
            }
            int popped = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return popped;
        }

        //peek - O(n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            while(!isEmpty()){
                s2.push(s1.pop());
            }
            int peek = s2.peek();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return peek;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
