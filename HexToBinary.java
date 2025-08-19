import java.util.Scanner;
import java.math.BigInteger;

public class HexToBinary {
    public static void main(String[] alpha) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine(); 
        
        String bin = new BigInteger(hex, 16).toString(2);
        System.out.println(bin);

        sc.close();
    }
}
