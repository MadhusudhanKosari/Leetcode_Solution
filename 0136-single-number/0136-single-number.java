class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // for(int i = 0;i<n;i++){
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // }
        // int ans=0;
        // for(HashMap.Entry<Integer,Integer> entry : hm.entrySet()){
        //     if(entry.getValue()== 1){
        //         ans = entry.getKey();

        //     }
        // }
        // return ans;
        int num = 0;
        for(int i = 0;i<n;i++){
            num ^= nums[i];
        }
        return num;
    }
}