class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        int k = 0;
        // HashMap<Integer,Integer> hm = new HashMap<>();
        
        // for(int i = 0;i<nums2.length;i++){
        //     hm.put(nums2[i],i);
        // }
        // boolean flag = true;
        // for(int num : nums1){
        //     int idx = hm.get(num);
        //     for(int j = idx+1;j<nums2.length;j++){
        //         if(num < nums2[j]){
        //             res[k++] = nums2[j];
        //             flag = false;
        //             break;
        //         }
        //     }
        //     if(flag){
        //         res[k++] = -1;
        //     }else{

        //         flag = true;
        //     }
        // }
        // return res;
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int num : nums2){
            st1.push(num);
        }
        for(int i = 0;i<nums1.length;i++){
            int maxi = Integer.MIN_VALUE;
            while(!st1.isEmpty() && st1.peek() != nums1[i]){
                // maxi = Math.max(maxi,st1.peek());
                if(st1.peek()>nums1[i]){
                    maxi = st1.peek();
                }
                st2.push(st1.pop());
            }
            if(maxi != Integer.MIN_VALUE && maxi > nums1[i]){
                res[k++] = maxi;
            }
            else{
                res[k++] = -1;
            }
            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        return res;
    }
}