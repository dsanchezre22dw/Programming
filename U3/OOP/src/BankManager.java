public class BankManager {

    private BankAccount[] accounts;
    private int count;


    public BankManager(){
        this.accounts = new BankAccount[20];
        this.count = 0;
    }
    public BankManager(BankAccount x){
        this.accounts = new BankAccount[20];
        this.accounts[0] = x;
        this.count = 1;
    }


    public void addBankAccount(BankAccount x){
        this.accounts[this.count] = x;
        this.count++;
    }


    public void show(){
        for (int i = 0; i < this.count; i++){
            System.out.println(this.accounts[i].show());
        }
        System.out.println("We have " + this.count + " bank accounts.");
    }



}
