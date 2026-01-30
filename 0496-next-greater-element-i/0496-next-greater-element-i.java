class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> st = new Stack<>();
       HashMap<Integer,Integer> hm = new HashMap<>();
       int n = nums2.length;
       for(int i = n-1;i>=0;i--){
        while(!st.isEmpty() && st.peek() <= nums2[i]){
            st.pop();
        }
        if(st.isEmpty()){
            hm.put(nums2[i],-1);
        }
        else{
            hm.put(nums2[i],st.peek());
        }
        st.push(nums2[i]);
       }
       int res[] = new int[nums1.length];
       int  k = 0;
       for(int num : nums1){
        res[k++] = hm.get(num);
       }
       return res;
    }
}