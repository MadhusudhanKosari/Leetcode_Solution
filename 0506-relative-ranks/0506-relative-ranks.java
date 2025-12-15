class Solution {
    public String[] findRelativeRanks(int[] score) {
        int   n = score.length;
        int[] arr = Arrays.copyOf(score, n);
        Arrays.sort(score);
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i = 0;i<n;i++){
            int val = n-i;
            if(val>3){

                hm.put(score[i],Integer.toString(val));
            }
            else if(val == 3){
                hm.put(score[i],"Bronze Medal");
            }
            else if(val == 2){
                hm.put(score[i],"Silver Medal");
            }
            else{
                hm.put(score[i],"Gold Medal");
            }
        }
        //List<String> ans = new ArrayList<>();
        String ans[] = new String[n];
        int k = 0,l = 0;
        for(int i = 0;i<n;i++){
            ans[i] = hm.get(arr[l++]);
        }
        return ans;
    }
}