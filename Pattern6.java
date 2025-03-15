/*Print an inverted right-angled triangle of stars.
Explanation:
Each row starts with n stars and decreases.
Sample Input:
•	5
•	4
Sample Output:
•	*****
****
***
**
*
•	****
***
**
*
 */
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        for(int i=n;i>0;i--) System.out.println(star.repeat(i));
    }
}
