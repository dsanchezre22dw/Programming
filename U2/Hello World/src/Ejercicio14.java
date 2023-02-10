import java.util.Scanner;


public class Ejercicio14{

    public static void main(String[] args) {
        int vowels = 0;
        String letra;
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe una letra ($ para parar)");
        letra = s.next();
        while (!letra.equals('$')) {
            if ("aeiouAEIOU".contains(letra)) {
                vowels += 1;

            }letra = s.next();

        }System.out.println("Has metido " + vowels + " vocales.");
    }
}
