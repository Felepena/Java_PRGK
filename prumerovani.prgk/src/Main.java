import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                double suma = 0;
                int pocet = 0;

                while (true) {
                    System.out.print("Zadej číslo nebo end pro ukončení: ");
                    String konec = input.nextLine().trim().toLowerCase();

                    if (konec.contains("end")){
                        System.out.println(suma/pocet);
                        break;
                    }

                    try{
                        double cislo = Integer.parseInt(konec);
                        suma +=cislo;
                        System.out.println(cislo);
                        pocet++;
                    }
                    catch (NumberFormatException ex){
                        ex.printStackTrace();
                    }
























            }
    }

}