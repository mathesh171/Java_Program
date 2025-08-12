/*
Input
5

Output
E 
D E 
C D E 
B C D E 
A B C D E 

*/

import java.util.Scanner;
public class Main{
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j<n;j++){
                System.out.print(((char)(j+'A'))+" ");
            }
            System.out.println();
        }
    }
}
