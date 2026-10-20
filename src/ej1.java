import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n;
        int i = 0;
        int contadorP = 0;
        int contadorceros = 0;
        int contadorN = 0;

        while (i < 10) {
            n = sc.nextInt();
            i++;

            if (n > 0) {
                contadorP++;
            } else if (n < 0) {
                contadorN++;
            } else {
                contadorceros++;
            }
        }

        System.out.println(contadorP + " Positivos");
        System.out.println(contadorceros + " ceros");
        System.out.println(contadorN + " Negativos");


    }
}