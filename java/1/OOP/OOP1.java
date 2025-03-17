class Student {
    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }


}

class GraduateStudent extends Student {

    private boolean isEmployed;
    private String companyName;

    GraduateStudent(String name, int rollNumber, int marks, boolean isEmployed, String companyName){
        super(name, rollNumber, marks);
        this.isEmployed = isEmployed;
        this.companyName = companyName;
    }

    public void displayDetails(){
        if(isEmployed == true){
            System.out.println(name+" is working in "+companyName);
        }else{
            System.out.println(name+" is Unemployed");
        }
    }

}

public class OOP1 {
    public static void main(String[] args) {
        Student student = new Student("Aryan", 3001, 99);
        GraduateStudent gradStudent = new GraduateStudent("Bob", 3002, 92, true,"Nucleus Teq");

        student.displayDetails();

        gradStudent.displayDetails();

    }
}
