class Solution {
    public int findDuplicate(int[] nums) {
        // int cnt[] = new int[1000000];
        // for(int i = 0;i<nums.length;i++){
        //     cnt[nums[i]]++;
        //     if(cnt[nums[i]]>1){
        //         return nums[i];
        //     }
        // }
        // return -1;
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
         slow = nums[0];
         while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
         }
         return slow;
    }
}