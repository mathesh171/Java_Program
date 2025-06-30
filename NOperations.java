/******************************************************************************

                           Given an integer N, your task is to find the minimum number of operations required to reduce N to 1. The allowed operations are:

1.    If N is divisible by 3, you can divide it by 3: N = N / 3.

2.    If N is divisible by 2, you can divide it by 2: N = N / 2.

3.    Subtract 1 from N: N = N−1.

Find the minimum number of operations required to reduce N to 1 using dynamic programming.


Constraints:
1 ≤ N ≤ 10^6

Example:
Example 1

Input:

10

Output:

3

Example 2

Input:

6

Output:

2


Explanation:
Explanation of example 1:

1.    10 - 1 = 9

2.    9 / 3 = 3

3.    3 / 3 = 1

Total operations = 3

Explanation of example 2:

1.    6 / 3 = 2

2.    2 / 2 = 1

Total operations = 2


*******************************************************************************/
import java.util.Scanner;

public class NOperations {
    public static int minimumOperations(int n, int count) {
        if (n == 1) {
            return count;
        }

        int three = Integer.MAX_VALUE;
        int two = Integer.MAX_VALUE;

        if (n % 3 == 0) {
            three = minimumOperations(n / 3, count + 1);
        }   

        if (n % 2 == 0) {
            two = minimumOperations(n / 2, count + 1);
        }

        int one = minimumOperations(n - 1, count + 1);

        return Math.min(one, Math.min(two, three));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minimumOperations(n, 0));
    }
}
