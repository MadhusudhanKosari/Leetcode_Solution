class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : arr1){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int k = 0;
        for(int i = 0;i<arr2.length;i++){
            int val = hm.get(arr2[i]);
            while(val-->0){
                arr1[k++] = arr2[i];
            }
            hm.remove(arr2[i]);
        }
        ArrayList<Integer> al =  new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            while(count-->0){
                al.add(num);
            }
        }
        Collections.sort(al);
        for (int num : al) {
            arr1[k++] = num;
        }

        return arr1;
    }
}