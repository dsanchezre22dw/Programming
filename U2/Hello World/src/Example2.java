import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe un número");
        int max = scan.nextInt(), min = max, i, x;
        for (i = 1; i < 10; i++) {
            System.out.println("Escribe un número");
            x = scan.nextInt();
            if (x > max){
                max = x;

            }else if (x < min){
                min = x;
            }
        }
        System.out.println("El máximo es : " + max + " y el mínimo es: " + min);
    }
}
