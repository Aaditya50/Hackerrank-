import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
             long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x == (byte)x)System.out.println("* byte");
            if(x == (short)x)System.out.println("* short");
            if(x == (int)x)System.out.println("* int");
            if(x == (long)x)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



/*

Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
Explanation

 -150 can be stored in a short, an int, or a long.

 213333333333333333333333333333333333 is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.

*/
