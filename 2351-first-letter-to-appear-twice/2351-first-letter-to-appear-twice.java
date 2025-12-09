class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        char arr[] = s.toCharArray();
        for(char c : arr){
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(hm.get(c) == 2){
                return c;
            }
        }
        return ' ';
    }
}