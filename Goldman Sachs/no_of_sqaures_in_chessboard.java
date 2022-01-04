// Java find number of squares in a
// chessboard
import java.util.Scanner;
class GFG
{
	// Function to return count of squares;
	static int countSquares(int n)
	{
		int result = 0;
    for(int i = 1 ;i <= n;i++){
      result+=(n-i+1)*(n-i+1);
    }
    return result;
	}
	
	// Driver code
	public static void main (String[] args)
	{
    Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Count of squares is "
						+countSquares(n));
	}
}

// This code is contributed by Anant Agarwal.
