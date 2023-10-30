import java.util.Scanner;
public class ACTIVIDAD3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int edad;
        int eMaxima = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible
        int eMinima = Integer.MAX_VALUE; // Inicializamos con el valor máximo posible
        System.out.println("Ingrese las edades y al acabar de introducirlas inserte -1: ");
        while (true) {
            edad = sc.nextInt();
            if (edad == -1) {
                break;
            }
            if (edad > eMaxima) {
                eMaxima = edad;
            }
            if (edad < eMinima) {
                eMinima = edad;
            }
        }
        if (eMaxima == Integer.MIN_VALUE && eMinima == Integer.MAX_VALUE) {
            System.out.println("No se ingresaron edades.");
        } else {
            System.out.println("La edad máxima es: " + eMaxima);
            System.out.println("La edad mínima es: " + eMinima);
        }
    }
}
