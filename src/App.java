import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el numero de inicio");
        int inicio = input.nextInt();
        System.out.println("ingrese el numero fin");
        int fin = input.nextInt();

        if (inicio > fin) {
            System.out.println("entrada no valida");
            input.close();
            return;
        }
        boolean encontrado = false;
        System.out.print(Math.max(2, inicio));
        for (int i = inicio; i < fin; i++) {
            int contadorDivisores = 0;
            int primerDivisor = 0;
            int segundoDivisor = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    contadorDivisores++;
                    if (contadorDivisores == 1) {
                        primerDivisor = j;
                    } else if (contadorDivisores == 2) {
                        segundoDivisor = j;
                    } else {
                    }
                }
            }
            if (contadorDivisores == 2) {
                encontrado = true;
                System.out.println(i + "numero amigo" + primerDivisor + segundoDivisor);
            }
        }
        if (!encontrado) {
            System.out.println("no se encontraron numeros amigos ");
        }
        input.close();
    }
}
