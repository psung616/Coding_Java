class Solution {
    public int solution(int n) {
         int[] fb = new int[n + 1]; // 피보나치 수 담을 배열 초기화
        //F(0) 과 F(1) 은 0과 1로 고정의 값임
        fb[0] = 0;
        fb[1] = 1;

        for (int i = 2; i <= n; i++) {
            // 두 수의 합을 1234567로 나눈 나머지를 현재 수로 저장
            fb[i] = (fb[i - 1] + fb[i - 2]) % 1234567; 
        }

        return fb[n];
    }
}