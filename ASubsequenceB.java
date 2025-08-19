/*
 Given two strings A and B, find if A is a subsequence of B. 
Constraints: 
● 1 ≤ Length of A, B ≤ 10⁵ 
Example: 
Input: 
A = AXY  
B = YADXCP 
Output: 0  
Input: 
A = gksrek 
B = geeksforgeeks 
Output: 1
 */

import java.util.Scanner;

public class ASubsequenceB {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), t = sc.nextLine();
        int n = s.length(), m = t.length();
        int i=0, j = 0;
        while(i<n && j<m){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        System.out.println((i==n)?1:0);
        sc.close();
    }
}
