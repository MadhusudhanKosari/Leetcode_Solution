class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        // If k still remains, remove from end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        if (st.isEmpty()) return "0";

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        // Remove leading zeros
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }

        sb = new StringBuilder(sb.substring(idx));

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
