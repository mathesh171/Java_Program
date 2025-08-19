import java.util.Scanner;

public class HexToBinWithoutInBuilt {
    public static void main(String[] alpha) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine().toUpperCase();

        StringBuilder binary = new StringBuilder();

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            switch (c) {
                case '0': binary.append("0000"); break;
                case '1': binary.append("0001"); break;
                case '2': binary.append("0010"); break;
                case '3': binary.append("0011"); break;
                case '4': binary.append("0100"); break;
                case '5': binary.append("0101"); break;
                case '6': binary.append("0110"); break;
                case '7': binary.append("0111"); break;
                case '8': binary.append("1000"); break;
                case '9': binary.append("1001"); break;
                case 'A': binary.append("1010"); break;
                case 'B': binary.append("1011"); break;
                case 'C': binary.append("1100"); break;
                case 'D': binary.append("1101"); break;
                case 'E': binary.append("1110"); break;
                case 'F': binary.append("1111"); break;
                default: 
                    System.out.println("Invalid Hex Digit: " + c);
                    return;
            }
        }

        System.out.println(binary.toString());

        sc.close();
    }
}
