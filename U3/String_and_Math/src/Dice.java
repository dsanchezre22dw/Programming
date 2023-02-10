public class Dice {

    private int number;
    private int try_ind;

    public Dice() {
        this.number = 0;
        this.try_ind = 0;
    }



    public void play() {
        int x = (int)Math.floor(Math.random()*(6-1+1)+1);
        this.number = x;
        this.try_ind++;
    }

    public void show(){
        System.out.println("[Number on the last try: " +
                this.number + ", number of tries played: " + this.try_ind + "]");
    }

    public int getNumber(){
        return this.number;
    }

    public int getTry_ind(){
        return this.try_ind;
    }
}