/*The pattern consists of two pyramid-like structures forming a diamond.
Sample Input:
•	3
•	5
Sample Output:
  *
 ***
*****
 ***
  *
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String space = " ", star = "*";
        for(int i=1;i<=n;i++)
            System.out.println(space.repeat(n-i)+ star.repeat((i*2)-1));
        for(int i=n-1;i>0;i--)
            System.out.println(space.repeat(n-i)+ star.repeat((i*2)-1));
    }
}
