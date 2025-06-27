/*
 Input
 Height = 10

 Output
                 1   1
             1   *   *   1
         1   *   1   1   *   1
     1   *   1   *   *   1   *   1
 1   *   1   *   1   1   *   1   *   1
 1   *   1   *   1   1   *   1   *   1
     1   *   1   *   *   1   *   1
         1   *   1   1   *   1
             1   *   *   1
                 1   1
 */
import java.util.Scanner;
public class Zoho_Pattern2 {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        System.out.print("Height = ");
        int n = sc.nextInt();
        String space = "    ";
        if(n%2==0){
            for(int i=0;i<n;i++){
                if(i<n/2){
                    System.out.print(space.repeat((n/2)-i-1));
                    for(int j=0;j<(i+1)*2;j++){
                        if(j<(i+1))
                        System.out.print(((j%2==0)?"1":"*")+"   ");
                        else
                        System.out.print(((j%2==0)?"*":"1")+"   ");
                    }
                }
                else{
                    System.out.print(space.repeat((i-(n/2))));
                    for(int j=0;j<((n-i)*2);j++){
                        if(j<(n-i))
                        System.out.print(((j%2==0)?"1":"*")+"   ");
                        else
                        System.out.print(((j%2==0)?"*":"1")+"   ");
                    }
                }
                System.out.println();
            }
        }else{
            for(int i=0;i<n;i++){
                if(i<=n/2){
                    System.out.print(space.repeat((n/2)-i));
                    for(int j=0;j<((i+1)*2)-1;j++){
                        System.out.print(((j%2==0)?"1":"*")+"   ");
                    }
                }
                else{
                    System.out.print(space.repeat((i-(n/2))));
                    for(int j=0;j<((n-i)*2)-1;j++){
                        System.out.print(((j%2==0)?"1":"*")+"   ");
                    }
                }
                System.out.println();
            }
        }

    }
}
