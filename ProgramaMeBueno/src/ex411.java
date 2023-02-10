import java.util.Scanner;


public class ex411 {

    public static void main(String[] args) {
        int peso_maximo, sum, count, peso;

        Scanner s = new Scanner(System.in);

        peso_maximo = s.nextInt();
        while (peso_maximo > 0){
            sum = 0;
            count = 0;
            boolean posible = true;

            peso = s.nextInt();
            while (peso != 0){
                if ((peso_maximo - sum) >= peso && posible){
                    sum += peso;
                    count++;
                }else{
                    posible = false;
                }
                peso = s.nextInt();
            }


            System.out.println(count);

            peso_maximo = s.nextInt();

        }
    }
}
