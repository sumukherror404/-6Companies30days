class GfG{
	String encode(String str)
	{
          String finalstring = "";// a final string that return the encoded string
          int n = str.length();// a variable to store the length of the string
          int count = 0;//a variable to store the count of the running length
          int i = 0;// a variable to control the loop traversal
          while(i < n){
              char c = str.charAt(i);// a variable to store the current character to compare its running length
              count = 1;
              for(int j = i+1; j<n; j++){
                  if (str.charAt(j) != c){
                      break;// if the chain of the character breaks, then loop terminates
                  }
                  else{
                      count++;
                  }
              }
              i += count ;// i value points to the character where the run breaks
              finalstring += c+Integer.toString(count);// concatenating the character and it's corresponding run length to the final string
          }
          return finalstring;// returning the string to the function call.
	}
	
 }

// { Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}
