public class SavingsAcc extends Account {

    Float interestRate = .02f;
    SavingsAcc(String name, String id, Float balance) {
        super(name, id, balance,2 , 0.025f);
    }
    SavingsAcc(String name, String id) {
        super(name, id,0.0f,2 , 0.025f);

    }
}
