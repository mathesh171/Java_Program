/*Print a right-angled triangle of stars.
Explanation:
Each row contains increasing '*' symbols.
Sample Input:
•	5
•	3
Sample Output:
•	*
**
***
****
*****
•	*
**
***
 */
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        for(int i=1;i<=n;i++) System.out.println(star.repeat(i));
    }
}
