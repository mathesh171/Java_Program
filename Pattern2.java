/*Each row contains centered increasing numbers.
Sample Input:
•	4
•	3
Sample Output:
   1
  121
 12321
1234321
  1
 121
12321
 */
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] alpha) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String space = " ";
        for(int i=1;i<=n;i++){
            System.out.print(space.repeat(n-i));
            for(int j=1;j<=i;j++) System.out.print(j);
            for(int j=i-1;j>0;j--) System.out.print(j);
            System.out.println();
        }
    }
}
