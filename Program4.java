public class Program4 {
    public static void main(String[] args) {

    }
    public abstract static class Account{
        public String accountOwnerName;
        public double balance;
        public int accountNumber;
        public Account(String accountOwnerName, double balance, int accountNumber) {
            this.accountOwnerName = accountOwnerName;
            this.balance = balance;
            this.accountNumber = accountNumber;


        }
        public int getAccountOwnerName(){
            return accountNumber;
        }
        public double getBalance(){
            return balance;
        }
        public String getAccountName(){
            return accountOwnerName;
        }
        public void setAccountNumber(int accountNumber){
            this.accountNumber = accountNumber;
        }
        public void setBalance(double balance){
            this.balance = balance;
        }
        public void setAccountOwnerName(String accountOwnerName){
            this.accountOwnerName = accountOwnerName;
        }

        public void deposit(double amount){
            if(amount > 0){
                balance += amount;
            }else{
                System.out.println("You can't deposit negative amount");
            }
        }
        public void withdraw(double amount){
            if(amount > 0){
                if(balance >= amount){
                    balance -= amount;
                }else{ System.out.println("Insufficient balance");}
            }else{ System.out.println("You can't withdraw negative amount"); }
        }
        public String info(){
            return(accountNumber + " is owned by " + accountOwnerName + " and has a balance of: " + balance);
        }
    }
    public static class Checking extends Account{
        public double overdraftLimit;
        public Checking(String accountOwnerName, double balance, int accountNumber) {
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
    public static class Saving extends Account{
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

}
