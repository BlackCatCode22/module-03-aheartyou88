package mystudent;

public class App {
    public static void main(String[] args) {

        Student myStudent = new Student();
        myStudent.firstName = "Amanda";
        myStudent.lastName = "You";
        myStudent.major = "Computer Information Systems";
        myStudent.gpa = 3.0;
        myStudent.age = 36;
        myStudent.onProbation = false;

        System.out.println("\n" + "The student's first name is: " + myStudent.firstName);
        System.out.println("The student's last name is: " + myStudent.lastName);
        System.out.println("The major the student will study in is: " + myStudent.major);
        System.out.println("The student's GPA is: " + myStudent.gpa);
        System.out.println("The student's age is: " + myStudent.age);
        System.out.println("Is the student on probation? " + myStudent.onProbation + "\n");

        Student myStudent2 = new Student();
        myStudent2.firstName = "Jason";
        myStudent2.lastName = "You";
        myStudent2.major = "Business";
        myStudent2.gpa = 3.8;
        myStudent2.age = 39;
        myStudent2.onProbation = false;

        System.out.println("The student's first name is: " + myStudent2.firstName);
        System.out.println("The student's last name is: " + myStudent2.lastName);
        System.out.println("The major the student will study in is: " + myStudent2.major);
        System.out.println("The student's GPA is: " + myStudent2.gpa);
        System.out.println("The student's age is: " + myStudent2.age);
        System.out.println("Is the student on probation? " + myStudent2.onProbation);
    }
}
