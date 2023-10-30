import java.util.Scanner;
public class ACTIVIDAD3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Emax, Emin;
        System.out.println("Intrduzca una edad: ");
        int num = sc.nextInt();
        while ( num !<= -1){

            System.out.println("La edad máxima es: " + Emax);
            System.out.println("La edad minima es: " + Emin);
            System.out.println("Intrduzca otra edad: ");
            num = sc.nextInt();

        }
    }
}
