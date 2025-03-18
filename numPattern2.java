/*
 Input
 5
 Output
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2 
 1
 */
import java.util.Scanner;
public class numPattern2 {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
