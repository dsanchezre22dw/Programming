import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = s.next();
        System.out.println("¿Cómo te apellidas?");
        String apellido = s.next();
        System.out.println("¿Cuántos años tienes?");
        int edad = s.nextInt();
        System.out.println("Tu nombre completo es " + nombre + ' ' + apellido + " y tienes " + edad + " años");
    }
}