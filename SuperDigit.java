/******************************************************************************

The super digit of a number is obtained by repeatedly summing its digits until a single-digit
number is reached.
Given an integer N, your task is to compute its super digit using this process.
Example Scenarios
Scenario 1
Input:
N = 9875
Explanation:
1. 9 + 8 + 7 + 5 = 29
2. 2 + 9 = 11
3. 1 + 1 = 2
4. Since 2 is a single digit, the super digit is 2.
Output:
2
Scenario 2
Input:
N = 1234
Explanation:
1. 1 + 2 + 3 + 4 = 10
2. 1 + 0 = 1
3. The super digit is 1.
Output:
1

*******************************************************************************/
import java.util.Scanner;
public class SuperDigit
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n==0){
		    System.out.println(0);
		    return;
	    }
		System.out.println((n%9==0)?9:n%9);
	}
}