import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak dlouhou čáru chceš vykreslit");


        int x = 0;
        int y = 1000;

        while (!(x==y)){

             y = scanner.nextInt();

            for ( x=0; x<y; x++){
                System.out.print(".");
            }


        }























    }
}