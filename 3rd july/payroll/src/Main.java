import java.util.Scanner;

public class Main{
    Scanner sc = new Scanner(System.in);

public static void main(String []args){

    Employee[] employees = new Employee[20];
    employees[0] = new SalariedEmployee("afif","hasan","123",200);
    employees[1] = new HourlyEmployee("Abu","Raihan","124",50,60);
    employees[2] = new CommissionEmployee("saikot", "islam", "125" , 1000, 8);
    employees[3] = new BasePlusCommissionEmployee("anamul","jewel","abe",1000,10,500);

    int numberOfEmployees = 4;
    for ( int i = 0; i < numberOfEmployees; i++ ) {
        if (employees[i] instanceof BasePlusCommissionEmployee){
           ((BasePlusCommissionEmployee) employees[i]).increaseBaseSalary();  //cant directly say employee[i].increseBaseSalary()
                                                                                // cause employee is of Employee class, not of other subclasses. so u have to use casting
        }
    }
    for(int i = 0; i < numberOfEmployees; i++){
        System.out.println( (i+1)+ " " + employees[i].toString());
        System.out.println("  His weekly earning is = "+ employees[i].earnings());
    }
}
}