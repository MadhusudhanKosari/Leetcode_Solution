class Solution {
    public int distinctPrimeFactors(int[] nums) {
        // long num = 1;
        // for(int i : nums) num = num * (long)i;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){

            int c = 0;
            int ans = 0;
            while(num % 2 == 0){
                c++;
                num/=2;
            }
            if(c>0) hs.add(2);
            for(int i = 3;i*i<=num;i+=2){
                c = 0;
                while(num%i == 0){
                    c++;
                    num/=i;
                }
                if(c>0) hs.add(i);
            }
            if(num>1) hs.add(num);
        }
        return hs.size();
    }
}