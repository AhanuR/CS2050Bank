import java.io.Serializable;

public class Savings extends Account implements Serializable {
    private static final long serialVersionUID = 1L;
    public double interestRate;
    public Savings(String accountOwnerName, double balance, int accountNumber, double interestRate){
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
        return("accountNumber " + accountNumber + " is owned by " + accountOwnerName + ", has an interest of " + interestRate + ", and has a balance of " + balance);
    }
}