class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        // int temp[] = new int[m+n];
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        // while(i>=0){
        //     nums1[k--] = nums1[j--];
        // }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
        // while(j<n){
        //     temp[k++] = nums2[j++];
        // }
        // System.out.print("[");
        // for(int a = 0;a<temp.length;a++){
        //     System.out.print(temp[a]);
        //     if(a!=n-1){
        //         System.out.print(",");
        //     }
        // }
        // System.out.print("]");
    }
}