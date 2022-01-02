//Driver code
import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] a = new int[n]; // a array with n numbers entries
        a[0]=0;// this step will intialise all the values of the array a to 0
        Arrays.sort(arr);// this will sort the array arr into ascending order
        int missing_value = 0,repeated_value = 0;
        for(int i = 0;i<n;i++){
            a[arr[i]-1]++;// marking the presence of numbers
        }
        for(int i = 0;i<n;i++){
            if(a[i]==2){ /*The repeating numbers presence will be marked twice*/
                repeated_value = i+1;
                continue;
            }
            if(a[i] == 0){/*The presence of the missed value is not marked and remains 0 only*/
                missing_value = i+1;
            }
        }
        int[] finalarray = new int[2];
        finalarray[0] = repeated_value;
        finalarray[1] = missing_value;
        return finalarray;
    }
}
