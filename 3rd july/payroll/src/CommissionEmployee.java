public class CommissionEmployee extends Employee {
    protected double grossSales;
    protected double commissionRate;
    public int employeeType=3;



    double earnings(){
        //System.out.println("his earning is " +grossSales*commissionRate * 7 /365 + "per week");

        return grossSales*commissionRate * 7 /365;
    }
    @Override
    public String toString(){
        return  firstName + " " + lastName  + " works for "+commissionRate + " % commission rate" ;
    }
    public CommissionEmployee(String firstname, String lastname,String securityNumber,double grossSales, double  commissionRate) {
        super(firstname,lastname,securityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

}
