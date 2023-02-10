import java.util.Scanner;

public class ex474 {

    public static void main(String[] args) {
        int i, first, second, third, casos, S, A, B, distancia;

        Scanner sc = new Scanner(System.in);

        casos = sc.nextInt();

        for (i = 1; i <= casos; i++){
            S = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();

            if (S>= 0 && S <= 10000 && A >= 0 && A <= 10000 && B >= 0 && B <= 10000){
                first = Math.abs(S - A) ;
                second = Math.abs(S - B);
                third = Math.abs(B - A);
                distancia = first < second ? first + third : second + third;

                System.out.println(distancia);




            }else{System.out.println("Posiciones incorrectas");
            }
        }
    }
}
