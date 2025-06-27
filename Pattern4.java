/*Print Pascal's Triangle.
Explanation:
Each row follows binomial coefficients.
Sample Input:
•	5
•	4
Sample Output:
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
    1
   1 1
  1 2 1
 1 3 3 1
 */
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String space = " ";
        for(int i=1;i<=n;i++){
            System.out.print(space.repeat(n-i));
            int c = 1;
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c = c * (i - j)/j;
            }
            System.out.println();
        }
    }
}
