/* 
Input 
5
Output
*****
*   *
*   *
*   *
*****

*/
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String space = " ", star = "*";
        for(int i=1;i<=n;i++){
            if(i==1 || i==n) System.out.println(star.repeat(n)); 
            else System.out.println(star+space.repeat(n-2)+star);
        }
    }

}
