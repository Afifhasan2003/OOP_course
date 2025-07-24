
public class MainClass {
    public static void main(String[] args) {


        Administration administration = new Administration();
        
        
        administration.initializeStudents();
        
        
        double averageAge = administration.showAverageAge();
        System.out.println("Average age: " + averageAge);

        System.out.println("Details of Student of ID 1615");
        administration.showDetails(1615);

        System.out.println("Lowest cgpa of the " + " software " + "department is " + administration.showLastInDepartment("software"));


        System.out.println("split according to hall");
        administration.splitStudentInfo();

    }
}