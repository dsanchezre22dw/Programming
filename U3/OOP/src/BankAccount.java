public class BankAccount {

    private Person p;
    private double balance;
    private boolean red;


    public BankAccount(Person x){
        this.p = x;
        this.balance = 0.0;
        this.red = false;
    }

    public BankAccount(Person x, double money){
        this.p = x;
        if (money >= 0.0){
            this.balance = money;
        }

        this.red = false;


    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            if (this.balance >= 0){
                this.red = false;
            }else{
                this.red = true;
            }
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && !this.red){
            this.balance -= amount;
            if (this.balance >= 0){
                this.red = false;
            }else{
                this.red = true;
            }
        }
    }

    public String show(){
        String x;
        if (this.red){
            x = "The account IS in red balance.";
        }else{
            x = "The account IS NOT in red balance.";
        }

        return p.toString() + "\n" + ("Balance of the account: " + this.balance) + ". " + x;
    }



}