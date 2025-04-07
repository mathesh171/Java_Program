import java.util.Scanner;
public class BinarySearchAlgorithm{

    public static int binarySearch(int arr[], int k){
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == k) return mid;
            else if(arr[mid] < k) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }
    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(binarySearch(arr,k));
    }
}