import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pocetmocnin = 0;
        int povazovanypocet = 69;

        System.out.println("kolik \uD83D\uDE08 chcete ?");

        povazovanypocet = scanner.nextInt();

        povazovanypocet++;

        while (!(pocetmocnin == povazovanypocet)) {




            for (pocetmocnin = 1; pocetmocnin < povazovanypocet; pocetmocnin++) {

                int vysledek = (pocetmocnin * pocetmocnin);

                for (int certiky = 0; certiky < pocetmocnin; certiky++){
                    System.out.print("\uD83D\uDE08 ");
                }
                System.out.println(vysledek);
            }

        }


    }
}