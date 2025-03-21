import java.util.Scanner;
public class Ejemplosoperadores {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ingrese el primero nemero");
        int numero1 =input.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 =input.nextInt();
        System.out.println("¿numero1 es igual a numero2? " + (numero1 == numero2));
        System.out.println("¿numero1 es diferente de numero2? " + (numero1 != numero2));
        System.out.println("¿numero1 es mayor que numero2? " + (numero1 > numero2));
        System.out.println("¿numero1 es menor que numero2? " + (numero1 < numero2));
        System.out.println("¿numero1 es mayor o igual que numero2? " + (numero1 >= numero2));
        System.out.println("¿numero1 es menor o igual que numero2? " + (numero1 <= numero2));
        input.close();
    }
    
}
