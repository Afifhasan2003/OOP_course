
public class Student{

    private String Name;
    private int registrationID;
    private String department;
    private String session;
    private int age;
    private double cgpa;
    private String hall;

    String getName(){
        return Name;
    }
    void setName(String name){
        this.Name = name;
    }
    int getRegistrationID(){
        return registrationID;
    }
    void setRegistrationID(int registrationID){
        this.registrationID = registrationID;
    }
    String getDepartment(){
        return department;
    }
    void setDepartment(String department){
        this.department = department;
    }
    String getSession(){
        return session;
    }
    void setSession(String session){
        this.session = session;
    }
    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }
    double getCgpa(){
        return cgpa;
    }
    void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    String getHall(){
        return hall;
    }
    void setHall(String hall){
        this.hall = hall;
    }

    public Student(String name, int registrationID, String department, String session, int age, double cgpa, String hall) {
        this.Name = name;
        this.registrationID = registrationID;
        this.department = department;
        this.session = session;
        this.age = age;
        this.cgpa = cgpa;
        this.hall = hall;
    }
    @Override
    public String toString() {
        return "Student info: " + "Name= " + Name + ", Registration ID= " + registrationID + 
               ", Department= " + department + ", Session= " + session + 
               ", Age= " + age + ", CGPA= " + cgpa + ", Hall= " + hall;
    }

}
