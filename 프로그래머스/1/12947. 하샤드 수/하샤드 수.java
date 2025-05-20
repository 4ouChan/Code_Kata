class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        if(x > 0 && x <=10000) {
            String str = String.valueOf(x);
            for (int i = 0; i < str.length(); i++) {
                int z = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum += z;
            }
            
            if (x % sum != 0) {
                answer = false;
            }
        }
        return answer;
    }
}