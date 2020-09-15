package problem_10_I;

public class Solution1 {
    public static void main(String[] args) {
        Solution solu = new Solution();
        int n = 5;
        System.out.println(solu.fib(n));
    }
}

class Solution {
    public int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a, b, next;
        a = 0;
        b = 1;
        for (int i=2; i<=n; i++) {
            next = (a + b) % 1000000007;
            a = b;
            b = next;
        }
        return b;
    }
}