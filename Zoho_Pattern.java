/*
 Input
 ZOHO

 Output

 Z       Z       Z
     O   O   O
 Z   O   *   H   O
     H   H   H
 O       O       O
 
 
 Input
 1234567

 Output
 1           1           1
     2       2       2
         3   3   3
 1   2   3   4   5   6   7
         5   5   5
     6       6       6
 7           7           7
*/
import java.util.Scanner;
public class Zoho_Pattern {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()%2==0){
            int n = s.length()+1;
            int m = s.length()+1;
            int a = -1, b = -1, c = -1, d = -1;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    char cur = ' ';
                    if(i==n/2 && j==m/2){
                        cur = '*';
                    }else if(i==j){
                        cur = s.charAt(++a);
                        
                    }else if(i+j==m-1){
                        cur = s.charAt(++b);
                        
                    }else if(i==n/2){
                        cur = s.charAt(++c);
                      
                    }else if(j==n/2){
                        cur = s.charAt(++d);
                    }
                    System.out.print(cur+"   ");
                }
                System.out.println();
            }
        }else{
            int n = s.length();
            int m = s.length();
            int a = -1, b = -1, c = -1, d = -1;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    char cur = ' ';
                    if(i==n/2 && j==n/2){
                        cur = s.charAt(++a);
                        b++;
                        c++;
                        d++;
                    }else if(i==j){
                        cur = s.charAt(++a);
                        
                    }else if(i+j==m-1){
                        cur = s.charAt(++b);
                        
                    }else if(i==n/2){
                        cur = s.charAt(++c);
                      
                    }else if(j==n/2){
                        cur = s.charAt(++d);
                    }
                    System.out.print(cur+"   ");
                }
                System.out.println();
            }
        }
    }
}
