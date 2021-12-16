package atm.machine.main;

class Account{
    private int id = 0;
    private double balance = 0;
    private double withdraw = 0;
    private double deposit = 0;
    private double amount = 0;

    Account(){
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getid(){
        return this.id;

    }
    public void setid(int newid){
        id = newid;
    }
    public double getbalance(){
        return this.balance;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
}
