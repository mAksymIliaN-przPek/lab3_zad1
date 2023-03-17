import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę studentów: ");
        int n = scanner.nextInt();


        int sumaPunktow = 0;


        int i = 0;
        while (i < n) {
            System.out.print("Podaj liczbę punktów dla studenta " + (i + 1) + ": ");
            int punkty = scanner.nextInt();
            sumaPunktow += punkty;
            i++;
        }

        double srednia = (double) sumaPunktow / n;

       
        System.out.println("Średnia liczba punktów w grupie: " + srednia);
    }
}
