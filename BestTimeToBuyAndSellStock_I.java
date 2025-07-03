/******************************************************************************

Best Time to Buy and Sell Stock
You are given an array of prices, where prices[i] represents the
price of a stock on the i-th day.
Your goal is to maximize your profit by buying the stock on one day
and selling it on a later day. You can only make one buy-and-sell
transaction.
Return the maximum profit you can achieve. If no profit is possible,
return 0.

Example 1:
Input: prices = [2, 4, 1, 7, 5, 8]
Output: 7
Explanation:
Buy on day 3 (price = 1) and sell on day 6 (price = 8).
Profit = 8 - 1 = 7.

Example 2:
Input: prices = [3, 3, 5, 0, 0, 3, 1, 4]
Output: 4
Explanation:
Buy on day 4 (price = 0) and sell on day 8 (price = 4).
Profit = 4 - 0 = 4.

Constraints:
● 1 <= prices.length <= 105
● 0 <= prices[i] <= 104

*******************************************************************************/
import java.util.Scanner;
public class BestTimeToBuyAndSellStock_I
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), prices[] = new int[26];
		for(int i=0;i<n;i++){
		    prices[i] = sc.nextInt();
		}
		int minValue = Integer.MAX_VALUE, maxProfit = 0;
		int currentProfit = 0;
		for(int price:prices){
		    if(price < minValue){
		        minValue = price;
		    }
		    currentProfit = price - minValue;
		    if(currentProfit > maxProfit){
		        maxProfit = currentProfit;
		    }
		}
		System.out.println(maxProfit);
	}
}