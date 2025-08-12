/*
Input
5
Output
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/


import java.util.Scanner;
public class Main{
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*", space = " ";
        for(int i=0;i<n;i++){
            System.out.println(star.repeat(n-i)+space.repeat(i*2)+star.repeat(n-i));
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(star.repeat(n-i)+space.repeat(i*2)+star.repeat(n-i));
        }
    }
}
