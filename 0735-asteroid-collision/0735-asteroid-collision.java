class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();
        for(int a : asteroids){
            boolean destroyed = false;
            while(!st.isEmpty() && st.peek()>0 &&a<0){
                if(Math.abs(st.peek()) < Math.abs(a)){
                    st.pop();
                }
                else if(Math.abs(st.peek()) == Math.abs(a)){
                    st.pop();
                    destroyed = true;
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                st.push(a);
            }
        }
        int newn = st.size();
        int res[] = new int[newn];
        int k = 0;
        for(int num : st){
            res[k++] = num;
        }
        return res;
    }
}