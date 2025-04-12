/*
 Find the first match of a pattern in a given string. The pattern may include two special characters and + with the following meanings: 
-The preceding character can occur zero or more times. 
+ The preceding character must occur at least once, but can appear any number of times. 
Example:  
Input : 
abcbbacbk 
bbk*ac+ 
Output: 
bbac
 */
import java.util.Scanner;;
public class StringPattern {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        int i = 0, n = s.length(), j = n;
        while(i<n && i<j){
            if(s.substring(i,j).matches(t)){
                System.out.println(s.substring(i,j));
                return;
            }
            j--;
            if(j==i){
                i++;
                j=n-1;
            }
        }
        System.out.print("Not Found");
    }
}
