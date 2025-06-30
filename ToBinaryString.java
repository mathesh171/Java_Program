/*
Given a positive integer, convert it into its binary representation without using built-in functions like Integer.toBinaryString(). The program should handle all valid cases and print an error message for invalid inputs.


Constraints:
The input number must be a non-negative integer (0 or greater).
The number should be within the range of Java's integer limit (0 ≤ num ≤ 2,147,483,647).
If the input is negative, the program should print "Invalid input! Please enter a positive number."

Example:
Example 1:
Input:

10
 
Output:
 
1010
 
Example 2:
Input:

100
 
Output:
 
1100100

Explanation:
Explanation:

10 in binary is 1010 (10 ÷ 2 → remainder 0, 5 ÷ 2 → remainder 1, 2 ÷ 2 → remainder 0, 1 ÷ 2 → remainder 1).
100 in binary is 1100100 (100 ÷ 2 → 0, 50 ÷ 2 → 0, 25 ÷ 2 → 1, 12 ÷ 2 → 0, 6 ÷ 2 → 0, 3 ÷ 2 → 1, 1 ÷ 2 → 1).


*/
import java.util.Scanner;
public class ToBinaryString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0){
		    System.out.println("Invalid input! Please enter a positive number.");
		    return;
		}
		String res = "";
// 		System.out.println(Integer.toBinaryString(n));
		while(n>0){
		    int rem = n % 2;
		    if(rem == 0){
		        res = '0' + res;
		    }else{
		        res = '1' + res;
		    }
		    n/=2;
		}
		
		System.out.println(res);
	}
}