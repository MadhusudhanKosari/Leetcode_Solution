class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = arr[1]-arr[0];
        for(int i = 2;i<arr.length;i++){
            minDiff = Math.min(minDiff,arr[i]-arr[i-1]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 1;i<arr.length;i++){
            // List<Integer>ls = new ArrayList<>();
            if(arr[i]-arr[i-1]== minDiff){
                // ls.add(arr[i-1]);
                // ls.add(arr[i]);
                // result.add(ls);
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return result;
    }
}