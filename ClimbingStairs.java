/*
Climbing Stairs 
You are climbing a staircase. It takes n steps to reach the top. 
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the 
top? 
Constraints: 1 <= n <= 45 
Example 1: 
Input: n = 2 
Output: 2 
Explanation: There are two ways to climb to the top. 
1. 1 step + 1 step 
2. 2 steps 
Example 2: 
Input: n = 3 
Output: 3 
Explanation: There are three ways to climb to the top. 
1. 1 step + 1 step + 1 step 
2. 1 step + 2 steps 
3. 2 steps + 1 step
 */

import java.util.Scanner;
public class ClimbingStairs{
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2){
            System.out.println(n);
            return;
        }
        int a = 1, b = 2;
        for(int i=3;i<=n;i++){
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
        sc.close();
    }
}