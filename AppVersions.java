/*
 Write a program that compares two app versions to detect if it is an upgrade or downgrade. 
Example: 
Input: 
Version 1 = 9.0.23 
Version 2 = 9.0.24 

Output: 
Upgraded

Input: 
Version 1 = 4.0.1 
Version 2 = 4.0 

Output: 
Downgraded 

Input: 
Version 1 = 1.01.15 
Version 2 = 1.1.15 

Output: 
Equal

Input: 
Version 1 = 11.9.15 
Version 2 = 11.9.15 

Output: 
Equal
 */
import java.util.Scanner;
public class AppVersions {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split("\\.");
        String t[] = sc.nextLine().split("\\.");
        int res = 0;

        for(int i=0;i<3;i++){
            int a , b;
            a = (i >= s.length)?0:Integer.parseInt(s[i]);
            b = (i >= t.length)?0:Integer.parseInt(t[i]);
            if(a==b){
                continue;
            }else if(a<b && res == 0){
                res = 1;
            }else if(a>b && res == 0){
                res = -1;
            }
        }

        if(res == -1){
            System.out.println("Downgraded");
        }else if(res == 1){
            System.out.println("Upgraded");
        }else{
            System.out.println("Equal");
        }
    }
}
