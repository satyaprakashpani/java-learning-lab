package CodingChallenge16Nov2025;

public class Student {

    private String name;
    private int rollNumber;
    private String section;
   //Initialize Object
    Student(String name, int rollNumber, String section){
        this.name=name;
        this.rollNumber=rollNumber;
        this.section=section;
    }

    //Print student details
    public void showStudentDetails(){
        System.out.println("Name : "+name+", Roll Number : "+rollNumber+", Section : "+section);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Bob",101,"A");//Create student object name as Bob
        s1.showStudentDetails();

    }
}
