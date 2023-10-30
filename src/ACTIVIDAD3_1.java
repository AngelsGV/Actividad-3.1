import java.util.Scanner;
public class ACTIVIDAD3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edad;
        int eMaxima = Integer.MIN_VALUE;
        //  Cualquier valor entero que se ingrese posteriormente será mayor que el valor inicial.
        int eMinima = Integer.MAX_VALUE;
        // Inicializamos con el valor máximo posible
        System.out.println("Ingrese las edades y al acabar de introducirlas inserte -1: ");
        while (true) {
            edad = sc.nextInt();
            if (edad <= -1) {
                break;
            //Si introducimos -1 o valores menore se acaba el bucle. No hay nadie que tenga -5 años de edad.
            }
            if (edad > eMaxima) {
                eMaxima = edad;
            }
            if (edad < eMinima) {
                eMinima = edad;
            }
        }
        if (eMaxima == Integer.MIN_VALUE && eMinima == Integer.MAX_VALUE) {
            // Deben haber edades de más del valor maximo y mínimo para ser valido.
            System.out.println("No se ingresaron edades.");
        } else { // Si cumple, mostraremos las edades máximas y minimas
            System.out.println("La edad máxima es: " + eMaxima);
            System.out.println("La edad mínima es: " + eMinima);
        }
    }
}
