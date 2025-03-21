import java.util.Scanner;

public class Ejerciciof4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ingrese su sueldo ");
        int sueldo = input.nextInt();
        if (sueldo > 3000) {
            System.out.println("debe abonar impuestos");
        }else{
            System.out.println("sueldo valido");
        }
        input.close();
    }
}
