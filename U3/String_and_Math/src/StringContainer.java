import java.util.Scanner;
public class StringContainer {

    private String string;
    private int constant;

    public StringContainer(String str2){
        this.string = str2;
        this.constant = 0;
    }

    public String toString(){
        return this.string + " " + this.constant;
    }

    public boolean isEqualTo(String str2) {
        return this.string.equals(str2);
    }


    public void shiftRight (int x){
        Scanner s = new Scanner(System.in);
        System.out.println("Insert the character");
        String c = s.next();
        String aux = "";
        for (int i=1; i<=x; i++){
            aux += c;
        }
        aux += this.string.substring(0,this.string.length()-x);
        this.string=aux;
        this.constant++;

    }

    public void shiftLeft (int x){
        Scanner s = new Scanner(System.in);
        System.out.println("Insert the character");
        String c = s.next();
        String aux = "";
        aux=aux+this.string.substring(x);
        for (int i=1; i<=x; i++){
            aux += c;
        }
        this.string=aux;
        this.constant++;

    }

    public void rotate(int x, char y){
        if (y == 'L'){
            String aux = this.string.substring(0,x);
            aux = this.string.substring(x) + aux;
            this.string = aux;
        }else if (y == 'R'){
            String aux = this.string.substring(this.string.length()-x);
            aux = aux + this.string.substring(0, this.string.length()-x);
            this.string = aux;
            this.constant++;
        }
    }

    public String encoding(int x){
        String aux = "";
        int value;
        char sum;

        for (int i = 0; i < this.string.length(); i++){

            value = i%2==0 ? (int)this.string.charAt(i)+x :
                    (int)this.string.charAt(i)-x;

            while (!((value >= 65 && value <= 90) || (value >= 97 && value <= 122))){
                value += i%2==0 ? -26 : 26;
            }

            sum = (char)value;

            aux += sum;
        }
        return aux;
    }

    public String encoding2(){
        int x = (int)Math.floor(Math.random()*(this.constant-1+1)+1);

        String aux = "";
        int value;
        char sum;

        for (int i = 0; i < this.string.length(); i++){

            value = i%2==0 ? (int)this.string.charAt(i)+x :
                    (int)this.string.charAt(i)-x;

            while (!((value >= 65 && value <= 90) || (value >= 97 && value <= 122))){
                value += i%2==0 ? -26 : 26;
            }

            sum = (char)value;

            aux += sum;
        }
        return aux;
    }

    public static StringContainer mixWords(StringContainer str1, StringContainer str2){
        int x, i;
        String[] part1 = str1.getStr().split(" ");
        String[] part2 = str2.getStr().split(" ");
        String[] bigger = Math.max(part1.length, part2.length) == part1.length ? part1 : part2;
        StringContainer result = new StringContainer("");
        for (i = 0; i < Math.min(part1.length, part2.length); i++){
            result.string += part1[i] + " " + part2[i] + " " ;
        }

        for (x = i; x < Math.max(part1.length, part2.length); x++){
            result.string += bigger[x];
        }

        result.constant++;
        return result;

    }

    public void show(){
        System.out.println(this.string);
    }

    public String getStr(){
        return this.string;
    }


}
