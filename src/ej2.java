import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cont = 0;


        do {
            System.out.print("Personas del grupo (0=FIN): ");
            n = sc.nextInt();

            if (n > 0) {
                cont += n;
                System.out.println("Apuntados. Van " + cont);
            } else if (n < 0) {
                System.out.println("No puede ser negativo");
            } else {
                System.out.print("");
            }
        } while (n != 0);

        double resultado=(n/55);

        System.out.println("Van a hacer falta: "+resultado+" Autobuses");

    }
}
