class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 띄어쓰기로 배열을 구분하여 나눈다.
        String[] arr = s.split(" ",-1);
        
        // 배열의 한단어씩 조회한다.
        for(int i=0; i<arr.length; i++){
            // 빈 문자열인 경우는 건너뛴다.
            if(arr[i].isEmpty()){
                answer += " ";
                continue;
            }
            // 맨앞단어 하나만 짤라서 대문자로 변경
            String a = arr[i].substring(0,1).toUpperCase();
            // 맨앞단어를 제외한 나머지단어는 소문자로 변경
            String b = arr[i].substring(1).toLowerCase();
            // 배열의 자리에 변경된 문자를 넣어준다.
            arr[i] = a + b;
        }
        // answer 에 각 문자마다 띄어쓰기된 문자열로 만들어서 join 메서드로 넣어준다.
        answer = String.join(" ", arr);
        
        return answer;
    }
}