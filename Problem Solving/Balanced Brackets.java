import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
//ANSWER STARTS
    public static String isBalanced(String str) {
    // Write your code here
    Stack<Character> st = new Stack<>();
    
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        
        if(ch == '(' || ch =='{' || ch == '['){
            st.push(ch);
        }else {
            if(st.isEmpty()){
                return "NO";
            }else{
                char c = st.pop();
                if(ch == ')' && c != '('){
                    return "NO";
                }else if(ch == '}' && c != '{'){
                    return "NO";
                }else if(ch == ']' && c != '['){
                    return "NO";
                }
            }
        }
    }
    if(st.isEmpty()){
        return "YES";
    }  else{
        return "NO";
    }
//ANSWER ENDS
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
/*
Sample Input

STDIN           Function
-----           --------
3               n = 3
{[()]}          first s = '{[()]}'
{[(])}          second s = '{[(])}'
{{[[(())]]}}    third s ='{{[[(())]]}}'
Sample Output

YES
NO
YES
*/
