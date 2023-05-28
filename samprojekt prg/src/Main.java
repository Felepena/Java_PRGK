import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> autokomponenty = new ArrayList<>();
        autokomponenty.add("Motor");
        autokomponenty.add("Vejfuk");
        autokomponenty.add("Kola");
        ArrayList<String> souperi = new ArrayList<>();


        souperi.add("bart");
        souperi.add("andrej");
        souperi.add("Pavel");
        souperi.add("zeman");


        System.out.println("sestav si auto tady máš na výběr z komponentu");
        System.out.println(autokomponenty);
        System.out.println("jaký z komponentu by si chtěl ");

        Scanner string_scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = string_scanner.nextLine();
            switch (input) {
                case "Motor":
                    autokomponenty.remove(new String(input));
                    System.out.println("vybral jsi motor ");
                    System.out.println(autokomponenty);
                    break;

                case "Vejfuk":
                    autokomponenty.remove(new String(input));
                    System.out.println("vybral jsi vejfuk");
                    System.out.println(autokomponenty);
                    break;

                case "Kola":
                    autokomponenty.remove(new String(input));
                    System.out.println("vybral jsi kola ");
                    System.out.println(autokomponenty);
                    break;
                default:
                    i--;
            }
        }


        System.out.println("nahodně vyber 3 random lidi / nahoda / ");

        System.out.println(souperi);

        Scanner String2 = new Scanner(System.in);
        String input2 = String2.nextLine();
        switch (input2) {

            case "nahoda":
                Collections.shuffle(souperi);
                    souperi.remove(souperi.get(0));
                break;

                }



        System.out.println("random 3 který si vybral" + souperi);

        Collections.shuffle(souperi);

        System.out.println("vyhrál "+ souperi.get(0));


    }


}
