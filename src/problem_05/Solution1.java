package problem_05;

public class Solution1 {
    public String replaceSpace(String s) {
        if (s.length() == 0)
            return s;
        char[] buffer = new char[s.length()*3];
        int n = 0;

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                buffer[n++] = '%';
                buffer[n++] = '2';
                buffer[n++] = '0';
            } else {
                buffer[n++] = ch;
            }
        }

        String res = new String(buffer, 0, n);
        return res;
    }

    public static void main(String[] args) {
        Solution1 solu = new Solution1();
        String s = "We are happy.";
        System.out.println(solu.replaceSpace(s));
    }
}