/*Given an array A[] of integers, sort the array according to frequency of elements. That is, elements that 
have higher frequency come first. If frequencies of two elements are the same, then a smaller number 
comes first. 
 
Constraints: 
● 1 ≤ Number of Test Cases ≤ 100 
● 1 ≤ N (size of array) ≤ 10⁵ 
● -10⁶ ≤ A[i] ≤ 10⁶ 
 
Example: 
 
Input: 
2 
5 
5 5 4 6 4 
5 
9 9 9 2 5 
 
Output: 
4 4 5 5 6 
9 9 9 2 5 */ 

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class SortUsingFreq {
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Integer arr[] = new Integer[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();

            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++) map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            Arrays.sort(arr, (a, b) -> {
                if(map.get(a).equals(map.get(b)))
                    return Integer.compare(a, b);
                return Integer.compare(map.get(b), map.get(a));
            });
            for(int x:arr)
                System.out.print(x+" ");
        }

        sc.close();
    }
    
}
