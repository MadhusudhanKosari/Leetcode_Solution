class Solution {
    public int findDuplicate(int[] nums) {
        int cnt[] = new int[1000000];
        for(int i = 0;i<nums.length;i++){
            cnt[nums[i]]++;
            if(cnt[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;
    }
}