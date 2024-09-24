 public abstract class Account{
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

