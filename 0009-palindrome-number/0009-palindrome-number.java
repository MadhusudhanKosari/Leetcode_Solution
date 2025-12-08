class Solution {
    public boolean isPalindrome(int x) {
        int rem,rev= 0;
        int temp = x;
        if(x<0){
            return false;
        }
        else{
           
            while(x>0){
                rem = x%10;
                rev = rev*10 + rem;
                x/=10;
            }
            if(rev!=temp){
                return false;
            }
        }
        return true;
    }
}