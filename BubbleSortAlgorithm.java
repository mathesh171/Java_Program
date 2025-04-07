import java.util.Scanner;
public class BubbleSortAlgorithm {

    public static void bubbleSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            boolean sorted = true;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    sorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(sorted) break;
        }
    }

    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        bubbleSort(arr, n);
        System.out.println("After Sorting : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
