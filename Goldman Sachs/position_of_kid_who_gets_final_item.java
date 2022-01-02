import java.util.* ;
public class a{
    static int finalposition(int n,int m,int k){
        if(m <= n-k+1){
            return m+k-1;
        }/*If the number of items are distributed in a single round, then we return the position
        that the final item is given*/

        m = m - (n-k+1);
        /*If the items can't be distributed in a single round, then we update the number of items 
        that are yet to be distributed after the first round of distribution*/
    
        if(m % n == 0){
            return n;
        }
        /* if the number of remaining items can be eqaully distributed to all the people, then we 
        simply return value of n */
        return m % n;
        /* if the above case fails, we return the remainder of the m and n, where the returned value gives
        the final position of the item distributed*/
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        System.out.println(finalposition(n,m,k));
        input.close();
    }
}
