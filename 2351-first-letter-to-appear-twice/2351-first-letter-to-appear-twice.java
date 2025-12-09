class Solution {
    public char repeatedCharacter(String s) {
        // HashMap<Character,Integer> hm = new HashMap<>();
        // //char arr[] = s.toCharArray();
        // for(int i = 0;i<s.length();i++){
        //     hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        //     if(hm.get(s.charAt(i)) == 2){
        //         return s.charAt(i);
        //     }
        // }
        // return ' ';
        int arr[] = new int[26];
        for(int i = 0;i<s.length();i++){
            int idx = s.charAt(i)-'a';
            arr[idx]++;
            if(arr[idx] == 2){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}