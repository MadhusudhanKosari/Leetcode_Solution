class Solution {
    final int MOD = 1000000007;
    public int[] findNSE(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty()? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    public int[] findPSEE(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty()? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
    public int sumSubarrayMins(int[] arr) {
       
       int nse[] = findNSE(arr);
       int psee[] = findPSEE(arr);
       long total = 0;
       for(int i = 0;i<arr.length;i++){
            int left = i-psee[i];
            int right = nse[i] - i;
            total = (total+(left*right*(long)arr[i])%MOD)%MOD;
       }
       return (int)total;
    }
}