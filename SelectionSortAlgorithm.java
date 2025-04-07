import java.util.Scanner;
public class SelectionSortAlgorithm {
    public static void selctionSort(int []arr, int n){
        int minIndex = 0;
        for(int i=0;i<n-1;i++){
            boolean min = false;
            minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                    min = true;
                }
            }

            if(min){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }


    public static void main(String[] alpha){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        selctionSort(arr, n);
        System.out.println("After Sorting : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
