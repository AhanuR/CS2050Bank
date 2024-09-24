public class Checking extends Account {
    public double overdraftLimit;
    public Checking(String accountOwnerName, double balance, int accountNumber, double overdraftLimit) {
        super(accountOwnerName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit){
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount){
        if(amount > 0){
            if(balance + overdraftLimit >= amount){
                balance -= amount;
            }else{ System.out.println("Insufficient balance");}
        }else{ System.out.println("You can't withdraw negative amount");}
    }
    public String info(){
        return("accountNumber " + accountNumber + " is owned by " + accountOwnerName + ", has an overdraft limit of " + overdraftLimit + ",and has a balance of " + balance);
    }
}