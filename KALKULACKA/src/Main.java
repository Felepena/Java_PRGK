import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Zadejte první číslo: ");
        num1 = sc.nextDouble();

        System.out.println("Zadejte operátor (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.println("Zadejte druhé číslo: ");
        num2 = sc.nextDouble();

        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Výsledek: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Výsledek: " + result);
                break;
            case '*':
                result =
                System.out.println("Výsledek: " + result);
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("Chyba: Nelze dělit nulou.");
                    break;
                }
                result = num1 / num2;
                System.out.println("Výsledek: " + result);
                break;
            default:
                System.out.println("Chyba: Neplatný operátor.");
        }
    }
}
