import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int left = 0;
        int right = A.length()-1;
            if(A.charAt(left)==A.charAt(right)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            left++;
            right--;
        
    }
}



