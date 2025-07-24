import javax.lang.model.element.NestingKind;

public class Administration {

    private Student[] students = new Student[20];



 
    void initializeStudents(){

        students[0] = new Student("afif", 1615, "software", "2023-24", 22, 3.62, "FH");
        students[1] = new Student("anita", 1601, "software", "2023-24", 22, 3.49, "rokeya");
        students[2] = new Student("nafisa", 1602, "software", "2023-24", 22, 3.90, "sufia");
        students[3] = new Student("charu", 1603, "software", "2023-24", 22, 4.00, "sufia");
        students[4] = new Student("saikot", 1604, "software", "2023-24", 22, 3.62, "shahidullah");
        students[5] = new Student("sourov", 1605, "software", "2023-24", 22, 3.62, "ekushe");
        students[6] = new Student("protty", 1606, "software", "2023-24", 22, 3.62, "jagannath");
        students[7] = new Student("nafis", 1607, "software", "2023-24", 22, 3.4, "ekushe");
        students[8] = new Student("ekramul", 1608, "EEE", "2023-24", 22, 3.25, "FH");
        students[9] = new Student("emon", 1609, "software", "2023-24", 22, 3.62, "shahidullah");
        // students[10] = new Student("anik", "1610", "software engineering", "2023-24", 22, 3.62, "shahidullah");
    }

    double showAverageAge(){
        int sumOfAge = 0;
        for(int i=0 ;i<10; i++){
            sumOfAge = sumOfAge + students[i].getAge(); 
        }
        double avg = (double) sumOfAge/10;
        return avg;
    }

    void showDetails(int ID){

        for(int i=0;i<10; i++){

            if(ID == students[i].getRegistrationID() ){
                System.out.println(students[i].toString());
            }
        }  
    }

    double showLastInDepartment(String departmentName) {

        double lastCG = students[0].getCgpa();
        int lastID = students[0].getRegistrationID();

        for (int i = 0; i < 9; i++) {
            if ((students[i].getCgpa() > students[i + 1].getCgpa()) && 
                    departmentName.equals(students[i+1].getDepartment()))
            {
                lastCG = students[i + 1].getCgpa();
                lastID = students[i + 1].getRegistrationID();

            }
        }

        // System.out.println("Details of the student of got the least CG: ");
        // showDetails(lastID);

        return lastCG;
    }

    void showTop3inSession(String session) {
       
       
    }

    void splitStudentInfo(){

        System.out.println("Fazlul haque halls: ");
        for(int i=0 ;i<10; i++){
            if (students[i].getHall().equals("FH"))
                {
                    System.out.println(students[i].getName() + " \n");
                }

        }

        System.out.println("rokeya halls: ");
        for(int i=0 ;i<10; i++){
            if (students[i].getHall().equals("rokeya"))
            {
                System.out.println(students[i].getName() + " \n");
            }

        }

        System.out.println("shahidullah halls: ");
        for(int i=0 ;i<10; i++){
            if (students[i].getHall().equals("shahidullah"))
            {
                System.out.println(students[i].getName() + " \n");
            }

        }


    }

}
