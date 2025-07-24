abstract class Account{
    private String name;
    private String id;
    private Float balance;
    private int accType;
    private Float interestRate;
    private int installmentNumber;
    private String atype;


    Account(String name, String id, Float balance,int AccType , Float interestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.accType = AccType;
        this.interestRate = interestRate;
    }
    Account(String name, String id, Float balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.accType = 1;
    }
    Account(String name, String id) {
        this.name = name;
        this.id = id;
        this.balance = 0f;
        this.accType = 1;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public Float getBalance() {
        return balance;
    }
    public void credit(float amount) {
        balance = balance + amount + balance*interestRate;
        installmentNumber++;
    }
    public void debit(float amount) {
        if (balance >= amount) {
            if (accType == 1){
                balance = balance - amount;
            }
            else if(accType == 2  ){
                if (balance >= 1000) balance = balance - amount;
                else     System.out.println("You must have at least 1000tk at the bank");
            }
            else if(accType == 3){
                if(installmentNumber >=5){
                    System.out.println("Can not withdraw before dew date");

                }
            }
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public void transferTo(Account another, float amount) {
        if (accType == 3){
            System.out.println("You can not transfer money from deposit account");
            return;
        }
        if (balance >= amount) {
            another.credit(amount);
            balance = balance - amount;
            System.out.println("transfer successful");
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public String toString() {
        if (accType == 1)
            atype = "current";
        else if (accType == 2)
            atype = "saving";
        else if (accType == 3)
            atype = "deposit";
        return "Name: " + name + ", Id: " + id + ", Balance: " + balance + ", Type: " + atype;

    }

}


