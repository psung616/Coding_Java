import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // s 문자열을 split 으로 짤라서 문자 배열에 담음.
        String[] strArr = s.split(" ");
        // int형으로 값을 sort 해야하기때문에 숫자 배열을 생성함.
        Integer[] intArr = new Integer[strArr.length];
        
        // strArr 에 담긴 값을 intArr에 int형으로 넣어줌.
        for(int i=0; i<strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        // 작은숫자부터 큰숫자 순으로 정렬해준다.
        Arrays.sort(intArr);
        
        int max = intArr[intArr.length-1];
        int min = intArr[0];
        
        answer += min + " " + max;
        
        return answer;
    }
}