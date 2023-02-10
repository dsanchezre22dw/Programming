public class BankManager_v2 {

    private BankAccount[] accounts;


    public BankManager_v2(){
        this.accounts = new BankAccount[1];
    }
    public BankManager_v2(BankAccount x){
        this.accounts = new BankAccount[1];
        this.accounts[this.getNull()] = x;
    }


    public void addBankAccount(BankAccount x){
        int i;
        BankAccount[] auxiliar = new BankAccount[accounts.length+1];
        for (i = 0; i < accounts.length; i++){
            auxiliar[i] = accounts[i];
        }
        auxiliar[i+1] = x;
        accounts =  new BankAccount[accounts.length+1];
        for (i = 0; i < accounts.length; i++){
            accounts[i] = auxiliar[i];
        }
    }

    public int getNull(){
        int i = 0;
        while (this.accounts[i] != null){
            i++;
            if (i == this.accounts.length-1){
                return -1;
            }
        }
        return i;
    }

    public void deleteBankAccount(){
        if (this.getNull() > 0){
            this.accounts[this.getNull()-1] = null;
        }else{
            System.out.println("The Bank Manager is empty)");
        }
    }

    public void show(){
        System.out.println(this.getNull());
        for (int i = 0; i < this.getNull(); i++){
            System.out.println(this.accounts[i].show());
        }
        System.out.println("We have " + this.getNull() + " bank accounts.");
    }

}
