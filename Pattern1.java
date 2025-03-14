/*
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
public class Pattern1 {

    public static void main(String[] alpha) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}