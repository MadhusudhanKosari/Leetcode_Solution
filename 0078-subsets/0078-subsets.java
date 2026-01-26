class Solution {
    // void checkss(int nums[],List<Integer> ans,int idx,List<List<Integer>> result){
    //     if(idx == nums.length){
    //         result.add(new ArrayList(ans));
    //         return ;
    //     }
    //     ans.add(nums[idx]);
    //     checkss(nums,ans,idx+1,result);
    //     ans.remove(ans.size()-1);
    //     checkss(nums,ans,idx+1,result);
    // }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // checkss(nums,ans,0,result);
        // return result;
        for(int i = 0;i<(1<<nums.length);i++){
            List<Integer> ans = new ArrayList<>();
            for(int j = 0;j<nums.length;j++){
                if((i&(1<<j))!=0){
                    ans.add(nums[j]);
                }
            }
            result.add(ans);
        }
        return result;
    }

}