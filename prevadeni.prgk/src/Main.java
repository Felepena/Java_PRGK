import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Zadej číslo: ");
                int decimal = sc.nextInt();
                String binary = decimalToBinary(decimal);
                System.out.println("Binární číslo: " + binary);
            }

            public static String decimalToBinary(int decimal) {
                String binary = "";
                while (decimal > 0) {
                    binary = (decimal % 2)+binary;
                    decimal /= 2;
                }
                return binary;
            }





    }
}