public class DepositAcc extends Account {

    Float interestRate = .07f;
    int installmentNumber = 0;
    DepositAcc(String name, String id, Float balance) {
        super(name, id, balance,3,0.07f);

    }
    DepositAcc(String name, String id) {
        super(name, id,0.0f ,3,0.07f);

    }
}
