class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int idx = 0;
        for(int i = 0;i<n;i++){
            // idx = 0;
            // boolean visit = false;
            for(int j = 0;j<m;j++){
                if(grid[i][j] <0){
                    // idx = j;
                    // visit = true;
                    // break;
                    count += 1;
                }
            }
            // if(!visit) continue;
            // else count+= m-idx;
            
        }
        return count;
    }
}