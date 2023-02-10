import java.util.Scanner;

public class ex335 {

    public static void main(String[] args) {
        int i, j, casos, altura;
        long canicas;

        Scanner s = new Scanner(System.in);

        casos = s.nextInt();

        for (i = 1; i <= casos; i++) {
            altura = s.nextInt();
            canicas = 0L;
            for (j = 1; j <= altura; j++) {
                canicas += (long)j*(j+1)/2;
            }
            System.out.println(canicas);
        }
    }
}
