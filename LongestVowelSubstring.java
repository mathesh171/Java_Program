/*
Given a string 'word', find the longest beautiful substring in 'word'. If no such substring exists, return 0 
A substring is considered beautiful if 
1. It contains all five vowels ('a', 'e', 'i', 'o', 'u') at least once. 
2. The vowels appear in sorted order (ie., all 'a's before 'e's, all 'e's before 'i's, and so on). 
Example: 
Input1:
aeiaaioaaaaeiiiiouuuooaauuaeiu 

Output1: 
The longest beautiful substring is "aaaaeiiiiouuu" 


Input2:
maeiaaioaaaaeziiiihouuuzooaauuaeiugn 

Output3: 
The longest beautiful substring is "aaaaeziiiihouuu" 


Input3: 
aeeeiiiioooauuuaeiou 

Output3: 
The longest beautiful substring is "aeiou" 

    
*/
import java.util.Scanner;
public class LongestVowelSubstring {
    public static void main(String[] alpha) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String vowel = "aeiou";
        int i = 0, j = 0, k = 0, n = s.length();
        int left = 0, right = 0, max = 0;
        while(j<n){
            if(s.charAt(j) == vowel.charAt(k)){
                if(k==0){
                    i = j;
                }
                k++;
            }else if(k>0 && s.charAt(j)==vowel.charAt(k-1)){
                j++;
                continue;
            }else{
                i++;
                k=0;
            }
            if(k==5) {
                if(j-i > max){
                    max = j-i;
                    left = i;
                    right = j;
                }
                k--;
            }
            System.out.println(i+" "+j+" "+k);
            j++;
        }
        System.out.println(s.substring(left, right+1));
    }
}

