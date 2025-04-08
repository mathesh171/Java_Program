import java.util.Scanner;
public class InsertionSortAlgorithm{
    public static void insertionSort(int arr[], int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i - 1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        insertionSort(arr, n);
        System.out.println("After Sorting : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}