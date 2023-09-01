import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int sum = 0;
        Integer[] bb = new Integer[B.length];
        for(int i=0; i<B.length; i++){
            bb[i] = Integer.valueOf(B[i]);
        }
        
        Arrays.sort(A);
        Arrays.sort(bb, Collections.reverseOrder());
        for(int i=0; i<A.length; i++){
            sum += A[i]*bb[i];
        }
        
        return sum;
    }
}