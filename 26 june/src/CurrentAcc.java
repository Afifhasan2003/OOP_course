public class CurrentAcc extends Account {

    Float interestRate = .00f;
    CurrentAcc(String name, String id,Float balance) {
        super(name, id, balance,1, 0.00f);
    }
    CurrentAcc(String name, String id) {
        super(name, id,0.0f,1 , 0.0f);
    }
}
