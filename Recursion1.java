// Print name N times using recursion

import java.util.Scanner;

class Main{
    public static void printName(String name, int n){
        if (n==0)
            return;
        System.out.println(name);
        printName(name, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of times to print your name: ");
        int n = sc.nextInt();
        printName(name, n);
    }

}