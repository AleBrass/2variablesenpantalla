
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dígame su DNI");
        String DNI = teclado.nextLine();
        System.out.println("DNI = " + DNI);
        System.out.println("Dígame su fecha de nacimento");
        String naci = teclado.nextLine();
        System.out.println("Fecha = " + naci);
        System.out.println("Hola usuario " + DNI + " con fecha de nacimiento " + naci);
    }
}