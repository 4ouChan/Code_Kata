import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            } 
        }
        
        if (arrList.size() == 0) {
                arrList.add(-1);
        }
        
        int[] answer = new int[arrList.size()];
        
        for (int j = 0; j < answer.length; j++) {
            answer[j] = arrList.get(j);
        }
             
        Arrays.sort(answer);
        
        return answer;
    }
}