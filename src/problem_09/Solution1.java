package problem_09;

import java.util.Stack;

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
public class Solution1 {
    public static void main(String[] args) {
        CQueue queue = new CQueue();
        queue.appendTail(3);
        queue.appendTail(4);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }
}

class CQueue {

    private Stack<Integer> st1;
    private Stack<Integer> st2;

    public CQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void appendTail(int value) {
        st1.push(value);
    }

    public int deleteHead() {
        if (st2.empty()) {
            while (!st1.empty()) {
                st2.push(st1.pop());
            }
        }
        if (st2.empty())
            return -1;
        else
            return st2.pop();
    }
}
