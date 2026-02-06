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
    public int maximalRectangle(char[][] matrix) {
        int MaxArea = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int prefixMat[][] = new int[n][m];
        for(int j = 0;j<m;j++){
            int sum = 0;
            for(int i = 0;i<n;i++){
                sum+= matrix[i][j]-'0';
                if(matrix[i][j] == '0'){
                    sum = 0;
                }
                prefixMat[i][j] = sum;
            }
        }
        for(int i = 0;i<n;i++){
            MaxArea = Math.max(MaxArea,largestRectangleArea(prefixMat[i]));
        }
        return MaxArea;
    }
}