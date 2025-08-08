import java.util.*;

public class StudentManagementSystem {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(01, "anita", "Computer Science"));
        students.add(new Student(02, "nafisa", "Software Engineering"));
        students.add(new Student(03, "fahmida", "Software Engineering"));
        students.add(new Student(04, "sajib", "Software Engineering"));
        students.add(new Student(05, "afif", "Computer Science"));

         printStudents(students);

        students.add(2, new Student(100, "superhero", "math"));
        students.remove(1);


        System.out.println("After adding and removing students:");
        // printStudents(students);





        Set<Student> oopCourse = new HashSet<>();
        oopCourse.add(students.get(0));
        oopCourse.add(students.get(3));
        oopCourse.add(students.get(2));
        oopCourse.add(students.get(0));

        System.out.println("Number of students in OOP Course: " + oopCourse.size());

        int checkStudent = 0;
        Student find = students.get(0);
        boolean isInClass = oopCourse.contains(find);
        if ( isInClass ) {
            System.out.println("SUCCESS: " + students.get(1).getStudentName() + " is already in OOP Course.");
        } else {
            System.out.println("ERROR:   " + students.get(1).getStudentName() + " is not in OOP Course.");
        }

        System.out.println("students in OOP Course: ");
        for (Student std: oopCourse) {
            System.out.println("  "+std);
        }



        Map<Integer, Student> studentMap = new HashMap<>();
        for(Student student : students) {
            studentMap.put(student.getStudentId(), student);
        }


        Student std = studentMap.get(03);
        System.out.println("From map: " + std);

    }



    public static boolean isStudentInCourse(Set<Student> course, Student student) {
        return course.contains(student);
    }
    
    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
