import java.util.Scanner;

public class Ejerciciof8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar los datos al usuario
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = scanner.nextInt();
        
        // Validar que la cantidad de respuestas correctas no sea mayor a las preguntas totales
        if (respuestasCorrectas > totalPreguntas || totalPreguntas <= 0 || respuestasCorrectas < 0) {
            System.out.println("Datos ingresados no válidos. Asegúrese de que las respuestas correctas no superen el total de preguntas y que los valores sean positivos.");
        } else {
            // Calcular el porcentaje de respuestas correctas
            double porcentaje = ((double) respuestasCorrectas / totalPreguntas) * 100;
            
            // Determinar el nivel del postulante
            String nivel;
            if (porcentaje >= 90) {
                nivel = "Nivel máximo";
            } else if (porcentaje >= 75) {
                nivel = "Nivel medio";
            } else if (porcentaje >= 50) {
                nivel = "Nivel regular";
            } else {
                nivel = "Fuera de nivel";
            }
            
            // Mostrar el resultado
            System.out.println("Porcentaje de respuestas correctas: " + porcentaje + "%");
            System.out.println("Nivel del postulante: " + nivel);
        }
        
        scanner.close();
    }
}