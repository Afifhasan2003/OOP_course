abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    abstract  double earnings();  //

    public String getFirstName() {
        return firstName;
    }

    public String toString(){
        return  firstName + " " + lastName + " " + socialSecurityNumber;
    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    

}
