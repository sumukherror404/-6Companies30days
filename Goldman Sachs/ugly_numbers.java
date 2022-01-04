// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            System.out.println(new Solution().getNthUglyNo(n));
        }
    }
}// } Driver Code Ends


class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        long[] dp = new long[n+1];
        dp[1] = 1;
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        for(int i = 2; i<=n ;i++){
            long f1 = 2 * dp[p2];
            long f2 = 3 * dp[p3];
            long f3 = 5 * dp[p5];
            long min = Math.min(f1,Math.min(f2,f3));
            dp[i] = min;
            if(min == f1){
                p2++;
            }
            if(min == f2){
                p3++;
            }
            if(min == f3){
                p5++;
            }
        }
        return dp[n];
    }
}
