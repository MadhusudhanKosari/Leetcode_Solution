class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> hs = new HashSet<>();
        int a = 0;
        int n = grid.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(!hs.contains(grid[i][j])){
                    hs.add(grid[i][j]);
                }
                else{
                    a = grid[i][j];
                
                    // break;
                }
            }
        }
        int sum =0;
        for(int num : hs){
            sum+=num;
        }
        int b = ((n*n)*((n*n)+1))/2 - sum;
        int res[]  = {a,b};
        return res;
    }
}