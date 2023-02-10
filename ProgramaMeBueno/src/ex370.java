import java.util.Scanner;

public class ex370 {

    public static void main(String[] args) {
        int casos, i;
        String[] x;
        Scanner sc = new Scanner(System.in);

        casos = sc.nextInt();

        for (i = 1; i <= casos; i++){
            x = sc.next().split("-");

            if ((Integer.parseInt(x[0]) == Integer.parseInt(x[1])+1 ||  Integer.parseInt(x[0]) == Integer.parseInt(x[1])-1) && Math.min(Integer.parseInt(x[0]), Integer.parseInt(x[1]))%2 == 0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

        }
    }





}
