class Solution {
    final long MOD = 1000000007;
    public int[] findnse(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty()? n: st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] findnge(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty()? n: st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] findpse(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty()? -1: st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] findpge(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty()? -1: st.peek();
            st.push(i);
        }
        return res;
    }
    public long sumOfSubMax(int arr[]){
        int n = arr.length;
        int pge[] = findpge(arr);
        int nge[] = findnge(arr);
        long total = 0;
        for(int i = 0;i<n;i++){
            long left = i-pge[i];
            long  right = nge[i] - i;
            total += left * right * (long)arr[i];
        }
        return total;
    }
    public long sumOfSubMin(int arr[]){
        int n = arr.length;
        int pse[] = findpse(arr);
        int nse[] = findnse(arr);
        long total = 0;
        for(int i = 0;i<n;i++){
            long left = i-pse[i];
            long right = nse[i] - i;
            total += left * right * (long)arr[i];
        }
        return total;
    }
    public long subArrayRanges(int[] nums) {
        // long sum = 0;
        return sumOfSubMax(nums) - sumOfSubMin(nums);
    }
}