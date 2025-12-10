class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // s = s+t;
        // Map<Character,Integer> hm = new HashMap<>();
        // for(int i = 0;i<s.length();i++ ){
        //     hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(Map.Entry<Character,Integer> entry:hm.entrySet()){
        //     if(entry.getValue()%2 != 0){
        //         return false;
        //     }
        // }
        // return true;
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String sorted1 = new String(arr);
        char arr1[] = t.toCharArray();
        Arrays.sort(arr1);
        String sorted2 = new String(arr1);
        if(sorted1.equals(sorted2)){
            return true;
        }
        return false;
    }
}