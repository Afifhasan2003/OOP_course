public class SalariedEmployee extends Employee {
    private int weeklySalary;
    public int employeeType=1;

    double earnings(){
    //    System.out.println("his earning is " +weeklySalary + "per week");
        return weeklySalary;
    }
    public String toString(){
        return  firstName + " " + lastName + " " + "earning= " + weeklySalary;
    }
    public SalariedEmployee(String firstName, String lastName, String securityNumber,int weeklySalary) {
        super(firstName,lastName,securityNumber);
        this.weeklySalary = weeklySalary;
    }

}
