/*You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to 
the right end while maintaining the relative order of the non-zero elements. The operation must be 
performed in place, meaning you should not use extra space for another array. 
 
Constraints: 
● 1 ≤ N ≤ 10⁶ 
● 0 ≤ A[i] ≤ 10⁹ 
 
Example: 
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0] 
Output: [1, 2, 4, 3, 5, 0, 0, 0] 
Input: arr[] = [10, 20, 30] 
Output: [10, 20, 30]  */


import java.util.Scanner;

public class MoveAllZeros {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int cur = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[cur];
                arr[cur] = temp;
                cur++;
            }
        }
        
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        
        sc.close();
    }
}
