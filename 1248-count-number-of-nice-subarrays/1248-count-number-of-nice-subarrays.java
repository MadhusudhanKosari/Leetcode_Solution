class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int n  = nums.length;
        for(int i = 0;i<n;i++){
            nums[i] = nums[i]%2;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int prefixSum = 0;
        for(int num : nums){
            prefixSum += num;
            int x = prefixSum - k;
            if(hm.containsKey(x)){
                count+=hm.get(x);
            }
            hm.put(prefixSum,hm.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}