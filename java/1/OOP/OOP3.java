import java.util.Scanner;

public class OOP3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student myStudent = new Student("Alice", 20, 70);

        System.out.println("Student Name is "+myStudent.getName());
        System.out.println("Student age is "+myStudent.getAge());
        System.out.println("Student marks is "+myStudent.getMarks());
        
        System.out.print("Enter updated marks ");
        int newMarks = sc.nextInt();
        myStudent.updateMarks(newMarks);

        System.out.println("Updated Marks "+myStudent.getMarks());

        sc.close();
     }
}

class Student{
    private String name;
    private int age;
    private int marks;

    Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getMarks(){
        return marks;
    }

    public void updateMarks(int marks){
        this.marks = marks;
    }
}