public class Saving extends Account {
    public double interestRate;
    public Saving(String accountOwnerName, double balance, int accountNumber, double interestRate){
        super(accountOwnerName, balance, accountNumber);
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public void applyInterest(double amount){
        if(amount > 0){
            balance += balance * (amount/100);
        }else{ System.out.println("You can't have negative interest");}
    }
    public String info(){
        return("accountNumber " + accountNumber + " is owned by " + accountOwnerName + ", has an interest of " + interestRate + ",and has a balance of " + balance);
    }
}