import java.util.Scanner;

public class chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int mayoresOIguales7 = 0;
        int menores7 = 0;
        StringBuilder listaMayores = new StringBuilder("Alumnos con notas mayores o iguales a 7: ");
        StringBuilder listaMenores = new StringBuilder("Alumnos con notas menores a 7: ");
        
        // Solicitar 10 notas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota del alumno " + i + ": ");
            int nota = scanner.nextInt();
            
            if (nota >= 7) {
                mayoresOIguales7++;
                listaMayores.append("Alumno ").append(i).append(" (Nota: ").append(nota).append(")\n");
            } else {
                menores7++;
                listaMenores.append("Alumno ").append(i).append(" (Nota: ").append(nota).append(")\n");
            }
        }
        
        // Mostrar resultados
        System.out.println("Cantidad de alumnos con notas mayores o iguales a 7: " + mayoresOIguales7);
        System.out.println("Cantidad de alumnos con notas menores a 7: " + menores7);
        System.out.println(listaMayores.toString());
        System.out.println(listaMenores.toString());
        
        scanner.close();
    }
}