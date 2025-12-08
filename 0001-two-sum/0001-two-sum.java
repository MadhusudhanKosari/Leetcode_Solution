class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp[] = new int[] {-1,-1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = nums[i];
            int req = target- sum;
            if(hm.containsKey(req)){
                temp[0] = hm.get(req);
                temp[1] = i;
                return temp;
            }
            hm.put(nums[i],i);
        }
        return temp;
    }
}