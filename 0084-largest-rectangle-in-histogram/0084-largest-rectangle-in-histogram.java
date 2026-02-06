class Solution {
    public int[] findNSE(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty()? n : st.peek();
            st.push(i);
        }
        return res;
    }
    public int[] findPSE(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            res[i] = st.isEmpty()? -1 : st.peek();
            st.push(i);
        }
        return res;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int nse[] = findNSE(heights);
        int psee[] = findPSE(heights);
        int maxArea = 0;
        for(int i = 0;i<n;i++){
            // int left = i-psee[i];
            // int right = nse[i] - i;
            int area = heights[i]*(nse[i]-psee[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
}