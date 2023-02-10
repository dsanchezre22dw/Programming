public class NumberStatistics {

    private int total;
    private int count;

    public NumberStatistics(){
        this.total = 0;
        this.count = 0;
    }

    public NumberStatistics(int number){
        this.total = number;
        this.count = 0;
    }

    public void addNumber(int number){
        this.total += number;
        count++;
    }

    public int amountOfNumbers(){
        return this.count;
    }

    public double showStatistics(){
        return (double)this.total/this.count;
    }
}
