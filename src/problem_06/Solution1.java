/*
 * 2020-08-31
 */

package problem_06;

import utils.ListNode;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution1 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> st = new Stack<>();
        int[] res;

        while (head != null) {
            st.add(head.val);
            head = head.next;
        }

        res = new int[st.size()];
        int i = 0;
        while (!st.empty()) {
            res[i] = st.peek();
            st.pop();
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[0];
    }
}