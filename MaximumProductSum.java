/*
Maximum Product Subarray 
Given an integer array nums, find a subarray that has the largest product, and return the 
product. 
The test cases are generated so that the answer will fit in a 32-bit integer. 
Constraints: 
● 1 <= nums.length <= 2 * 104 
● -10 <= nums[i] <= 10 
● The product of any subarray of nums is guaranteed to fit in a 32-bit integer. 
Example 1: 
Input: nums = [2,3,-2,4] 
Output: 6 
Explanation: [2,3] has the largest product 6. 
Example 2: 
Input: nums = [-2,0,-1] 
Output: 0 
Explanation: The result cannot be 2, because [-2,-1] is not a subarray. 
 */

import java.util.Scanner;
public class MaximumProductSum {
    public static void main(String[] alpha) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int proL = 1, proR = 1, res = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            proL *= arr[i];
            proR *= arr[n-i-1];
            res = Math.max(proL, res);
            res = Math.max(proR, res);
            if(proL == 0) proL = 1;
            if(proR == 0) proR = 1;
        }
        System.out.println(res);
        sc.close();
    }
}
