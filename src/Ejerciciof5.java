import java.util.Scanner;

public class Ejerciciof5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int numero1 = input.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2 = input.nextInt();
        if (numero1 == numero2) {
            System.out.println("los numeros deben ser distintos");
        }else{
            int mayor = (numero1 > numero2)? numero1 : numero2;
            System.out.println("el mayor numero es: "+ mayor);
        }
        input.close();
    }
    
}
