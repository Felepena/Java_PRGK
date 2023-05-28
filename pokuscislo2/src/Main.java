import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int chatky;
        int cena;
        boolean[] myArray = new boolean[7];
        Arrays.fill(myArray, false);

        while (true) {


            System.out.println("vybete si akci\n1-rezervovat\n2-ukončit akci\n3-zobrazit zabrané chatky");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("jakou chatku chcete 1-7");
                    chatky = scanner.nextInt();

                    if (chatky == 7) {
                        if (!myArray[chatky - 1]) {
                            myArray[chatky - 1] = true;
                            System.out.println("do chatky muzou maximalně 8\nkolik se vás chce zabydlet ?");
                            int zabydleni = scanner.nextInt();
                            if (zabydleni > 8) {
                                System.out.println("tolik se vás do chatky nevejde");
                                myArray[chatky - 1] = false;

                            } else {
                                System.out.println("v chatce se zabydlelo " + zabydleni + "/8");
                                if (zabydleni == 8) {
                                    cena = 70 * 4;
                                } else {
                                    cena = 100 * zabydleni;
                                }
                                System.out.println("cena za chatku " + cena);

                            }
                        }
                    } else if (!myArray[chatky - 1]) {
                        myArray[chatky - 1] = true;
                        System.out.println("do chatky muzou maximalně 4\nkolik se vás chce zabydlet ?");
                        int zabydleni = scanner.nextInt();
                        if (zabydleni > 4) {
                            System.out.println("tolik se vás do chatky nevejde");
                            myArray[chatky - 1] = false;
                        }else{

                            System.out.println("v chatce se zabydlelo " + zabydleni + "/4");
                            if (zabydleni == 4) {
                                cena = 70 * 4;
                            } else {
                                cena = 100 * zabydleni;
                            }
                            System.out.println("cena za chatku " + cena);

                        }
                    }

                    break;

                case 2:
                    return;

                case 3:

                    System.out.println("jake chatky jsou už zabrané");

                    for (int i = 0; i < myArray.length; i++) {
                        if (myArray[i]) {
                            System.out.print(i + 1 + ",");
                        }
                    }

                    break;


                default:
                    System.out.println("neco se nepovedlo :(");


            }
        }
    }
}
