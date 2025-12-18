class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
       int x = (k%length);
       int temp[] = new int[length];
        for(int i = 0;i<length;i++){
            temp[(i+x)%length] = nums[i];
        }
         for (int i = 0; i < length; i++) {
            nums[i] = temp[i];
        }
        System.out.print("[");
        for(int i = 0;i<length;i++){
            System.out.print(nums[i]);
            if(i!=length-1){
                 System.out.print(",");
            }
        }
         System.out.print("]");
    }
}