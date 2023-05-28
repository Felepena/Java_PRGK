import java.util.Scanner;

public class Main {
    private static final int POCET_CHATEK = 7;
    private static final int[] KAPACITA_CHATKY = {4, 4, 4, 4, 4, 5, 8};
    private static boolean[] obsazeneChatky = new boolean[POCET_CHATEK];
    private static int[] obsazeneLuzka = new int[POCET_CHATEK];
    private static final int CENA_LUZKA = 100;
    private static final int CENA_LUZKA_SLEVA = 50;
    private static int celkovyVydelek = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Rezervovat chatku");
            System.out.println("2 - Zobrazit obsazenost a celkový výdělek");
            System.out.println("3 - Konec");

            int volba = scanner.nextInt();

            switch (volba) {
                case 1:
                    rezervovatChatku(scanner);
                    break;
                case 2:
                    zobrazitObsazenost();
                    break;
                case 3:
                    System.out.println("Program ukončen.");
                    return;
                default:
                    System.out.println("Neplatná volba. Zkuste to znovu.");
                    break;
            }
        }
    }

    private static void rezervovatChatku(Scanner scanner) {
        System.out.println("Vyberte si číslo chatky (1-" + POCET_CHATEK + "):");
        int cisloChatky = scanner.nextInt();

        if (cisloChatky < 1 || cisloChatky > POCET_CHATEK) {
            System.out.println("Neplatné číslo chatky.");
            return;
        }

        if (obsazeneChatky[cisloChatky - 1]) {
            System.out.println("Chatka č. " + cisloChatky + " je již obsazená.");
            return;
        }

        int volneLuzka = KAPACITA_CHATKY[cisloChatky - 1] - obsazeneLuzka[cisloChatky - 1];
        System.out.println("Počet volných lůžek: " + volneLuzka);

        if (volneLuzka == 0) {
            System.out.println("Chatka č. " + cisloChatky + " je již obsazená.");
        } else {
            System.out.println("Kolik lůžek si přejete rezervovat?");
            int pocetLuzek = scanner.nextInt();

            if (pocetLuzek < 1 || pocetLuzek > volneLuzka) {
                System.out.println("Neplatný počet lůžek.");
                return;
            }

            int cena = pocetLuzek * CENA_LUZKA;
            if (pocetLuzek == volneLuzka) {
                cena -= pocetLuzek * CENA_LUZKA_SLEVA;
            }
            obsazeneLuzka[cisloChatky - 1] += pocetLuzek;
            celkovyVydelek += cena;
            obsazeneChatky[cisloChatky - 1] = true;
            System.out.println("Chatka č. " + cisloChatky + " byla úspěšně zarezervována.");
            System.out.println("Celková cena: " + cena + " Kč.");
        }
    }

    private static void zobrazitObsazenost() {
        int obsazeneLuzkaCelkem = 0;
        int volneLuzkaCelkem = 0;

        for (int i = 0; i < POCET_CHATEK; i++) {
            if (obsazeneChatky[i]) {
                obsazeneLuzkaCelkem += obsazeneLuzka[i];
            } else {
                volneLuzkaCelkem += KAPACITA_CHATKY[i];
            }
        }

        int celkovaKapacita = POCET_CHATEK * KAPACITA_CHATKY[0];
        double procentaObsazenosti = (double) obsazeneLuzkaCelkem / celkovaKapacita * 100;

        System.out.println("Obsazenost: " + obsazeneLuzkaCelkem + "/33 " );
        System.out.println("Volná místa: " + volneLuzkaCelkem);
        System.out.println("Procentuální obsazenost: " + procentaObsazenosti + "%");
        System.out.println("Celkový výdělek: " + celkovyVydelek + " Kč");
    }
}
