import java.util.Scanner;

public class Ejercicio2f2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresar primera nota");
        float nota1 = input.nextInt();
        System.out.println("ingrese segunda nota");
        float nota2 = input.nextInt();
        System.out.println("ingrese tercera nota ");
        float nota3 = input.nextInt();
        float promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 7) {
            System.out.println("promocionado");
        } else {
            System.out.println("no promocionado");
        }
        input.close();
    }
}
