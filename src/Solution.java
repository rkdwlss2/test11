// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    static int[] array = new int[100001];
    static int now = -1;

    public static int solution(int[] A) {
        int answer=0;
        // write your code in Java SE 11
        for (int i = 0 ; i<A.length;i++){
            array[A[i]-1]=1;
            int start;
            if (now==-1){
                start=0;
            }else{
                start=now;
            }
            while(start<=i){
                if (array[start]==0){
                    break;
                }
                now=start;
                start++;
            }
            if (i+1==start)answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.print(solution(new int[]{2, 3, 4, 1, 5}));
    }
}
