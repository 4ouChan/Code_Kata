class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(double a : numbers) {
            answer += a;
        }
        answer = answer / numbers.length;
        return answer;
    }
}