public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public int employeeType=4;


    @Override
     double earnings(){
      //  System.out.println("his earning is " +baseSalary + commissionRate * grossSales / 100 + "per week");

          return baseSalary + commissionRate * grossSales / 100;
    }
    @Override
    public String toString(){
        return firstName +" "+ lastName + " earns base salary = " + baseSalary +", and additional " + commissionRate + " % commition";
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String securityNum, double grossSales, double commissionRate, double baseSalary) {
        super(firstName,  lastName, securityNum, grossSales,   commissionRate);
        this.baseSalary = baseSalary;
    }

    public void increaseBaseSalary(){
        baseSalary = baseSalary + baseSalary * 0.1;
    }
}
