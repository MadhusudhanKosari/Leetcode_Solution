class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = 0;
        int low = 0;
        int high = n-1;
        while(low<high){
                int width = high-low;
                int length;
                if(height[low]<height[high]){
                    length = height[low];
                    low++;
                }
                else{
                    length = height[high];
                    high--;
                }
                area = Math.max(area,width*length);
                
        }
        return area;
    }
}