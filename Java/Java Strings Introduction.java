import java.io.*;
import java.util.*;

public class Solution {

 public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
    }
    
    public static String capitalizeFirstLetter(String original) {
    if (original == null || original.length() == 0) {
        return original;
    }
    return original.substring(0, 1).toUpperCase() + original.substring(1);
}
}



/*
Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String A is "hello" and B is "java".

 A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.

When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".


*/
