public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private int hourWorked;
    public int employeeType=2;
  ;

    @Override
   public double earnings() {
     //   System.out.println("his earning is " +hourlyWage * 8 *7 + "per week");
            if (hourWorked>40) {

                return (hourlyWage * 40 + hourlyWage * (hourWorked - 40) * 1.5);
            }
            else {
                return hourlyWage * hourWorked ;
            }
    } //8 hours per day
    @Override
    public String toString(){
        return  firstName + " " + lastName + " " + " worked " + hourWorked + " hours "+"at " + hourlyWage +" hourly wage";
    }
    public HourlyEmployee(String firstName, String lastName, String securityNumber, double HourlyWage, int HourWorked) {
        super(firstName, lastName, securityNumber);
        this.hourlyWage = HourlyWage;
        this.hourWorked = HourWorked;
    }

}
