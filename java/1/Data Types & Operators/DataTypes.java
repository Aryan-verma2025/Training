public class DataTypes {
    public static void main(String[] args) {
        
        //Primitive data types
        byte myByte = 2;
        short myShort = 5;
        int myInt = 65;
        long myLong = 99999999;
        float myFloat = 3.14f;
        double myDouble = 4.3445;
        boolean myBool = true;
        char myChar = 'c';

        System.out.println("Primitive data types:");

        System.out.println("Byte = "+myByte);
        System.out.println("Short = "+myShort);
        System.out.println("Int = "+myInt);
        System.out.println("Long = "+myLong);
        System.out.println("Float = "+myFloat);
        System.out.println("Double = "+myDouble);
        System.out.println("Boolean = "+myBool);
        System.out.println("Char = "+myChar);

        //Reference Data types

        String myString = "This is string in java";
        Person p = new Person("Aryan","Verma",22);

        System.out.println("Reference data types:");

        System.out.println("My String is :"+myString);
        System.out.println("Person Details :");
        p.showDetails();
    }
}

class Person{
    String firstName, lastName;
    int age;

    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void showDetails(){
        System.out.println("Name : "+firstName+" "+lastName);
        System.out.println("Age : "+age);
    }
}
