import java.util.Scanner;
public class Game{

    Scanner s = new Scanner(System.in);
    private Player winner = new Player("David", new Dice()), sec_winner = new Player("David", new Dice());


    public Game() {

    }

    public void main() {
        int sum, count, sum_big = 0, count_big = 0, x;
        String name_win = "", name_win2 = "";

        System.out.println("How many characters are there playing?");
        x = s.nextInt();
        Player[] list = new Player[x];

        for (int i = 0; i < x; i++){
            System.out.println("Insert the name of the player " + i);
            String name = s.next();

            list[i] = new Player(name, new Dice());

            sum = 0;
            count = 0;
            for (int j = 0; j < 6; j++){
                list[i].tryy();
                sum += list[i].getDiceValue();
                if (list[i].getDiceValue() == 6){
                    count++;
                }
            }

            if (i == 0){
                this.winner = list[i];
                this.sec_winner = list[i];
                sum_big = sum;
                count_big = count;
                name_win = name;
                name_win2 = name;
            }else if (sum > sum_big){
                this.winner = list[i];
                sum_big = sum;
                name_win = name;
            }if (count > count_big){
                this.sec_winner = list[i];
                count_big = count;
                name_win2 = name;
            }

            System.out.println(sum);
            System.out.println(count);
            System.out.println();

        }

        System.out.println("The winner is : " + name_win + ", (" + sum_big + " points), and the second winner is: " + name_win2 + ", (" + count_big + " sixes).");
    }
}