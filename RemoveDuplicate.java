/*
Remove all duplicate characters from the given string while preserving the order. 
Constraints: 
1. Do not use any built-in functions. 
2. Perform the operation using in-place memory (do not use an additional variable to store the result). 
3. For alphabets, keep only the first occurrence 
4. For digits, keep only the last occurrence. 

Input: 
a1b2c34c3b2cb3a1d 

Output: 
abc4231d
 */

import java.util.Scanner;
public class RemoveDuplicate{
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int letter[] = new int[26];
        int num[] = new int[10];
        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i)>47 && s.charAt(i)<59) && num[s.charAt(i) - '0']==0){
                num[s.charAt(i) - '0']= i + 1;
            }

            if((s.charAt(i)>96 && s.charAt(i)<123)){
                letter[s.charAt(i) - 'a'] = i + 1;
            }
        }
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>47 && s.charAt(i)<59) && num[s.charAt(i) - '0']==(i+1)){
                System.out.print(s.charAt(i));
            }

            if((s.charAt(i)>96 && s.charAt(i)<123) && letter[s.charAt(i) - 'a']==(i+1)){
                System.out.print(s.charAt(i));
            }
        }
    }
}