/*
Missing Number
You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). 
This array represents a permutation of the integers from 1 to n with one element missing. Your task is to 
identify and return the missing element. 
Constraints: 
● 1 ≤ n ≤ 10⁶ 
● Array arr[] has size n - 1 and contains distinct integers from 1 to n 
Example: 
Input: arr[] = [1, 2, 3, 5] 
Output: 4 
Input: arr[] = [8, 2, 4, 5, 3, 7, 1] 
Output: 6 
Input: arr[] = [1] 
Output: 2 
 */
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] alpha) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        long sum = 0, totalSum = (long) (n+1) * (n+2) / 2;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println(totalSum - sum);
        sc.close();
    }
}
