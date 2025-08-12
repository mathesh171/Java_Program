/*
Input
zohocorporationteam

Output
z o h o c o r 
          p
        o
      r
    a
  t
i o n t e a m 
*/

import java.util.Scanner;
public class Main{
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), space = " ";
        int n = Math.round((float)(s.length() + 2) / 3);
        int i = 0;
        for(i=0;i<n;i++)
            System.out.print(s.charAt(i)+" ");
        System.out.println();
        for(int j=0;j<n-1;j++){
            if(j==n-2){
                System.out.print(space.repeat((n-j-2)*2)+s.charAt(i+j)+" ");
                break;
            }
            System.out.println(space.repeat((n-j-2)*2)+s.charAt(i+j));
        }
        for(i=i+n-1;i<s.length();i++)
            System.out.print(s.charAt(i)+" ");
    }
}
