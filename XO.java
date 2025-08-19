/*
You are given a string s consisting of n characters which are either 'X' or 'O'.A move is defined as selecting 
three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', 
it will stay the same.Return the minimum number of moves required so that all the characters of s are 
converted to 'O'. 
Constraints: 
● 1 ≤ Length of String ≤ 10⁵ 
● String consists of only characters 'X' and 'O' 
Example: 
Input: s = "XXX" 
Output: 1 
Input: s = "XXOX" 
Output: 2
 */
import java.util.Scanner;
public class XO {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = 0, n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='X'){
                i+=2;
                res++;
            }
        }
        System.out.println(res);
        sc.close();
    }
    
}
