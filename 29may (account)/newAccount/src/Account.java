class Account{
    private String name;
    private String id;
    private Float balance;

    Account(String name, String id, Float balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }
    Account(String name, String id) {
        this.name = name;
        this.id = id;
        this.balance = 0f;
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
        balance = balance + amount;
    }
    public void debit(float amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public boolean transferTo(Account another, float amount) {
        if (balance >= amount) {
            another.credit(amount);
            balance = balance - amount;
            System.out.println("transfer successful");
            return true;
        }
        else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    public String toString() {
        return "Name: " + name + ", Id: " + id + ", Balance: " + balance;  
        
    }

}


