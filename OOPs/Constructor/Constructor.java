class Student {

    // default constructor
    Student() {
        System.out.println("Hello What's up!");
    }

    // parametric coustructor
    Student(int a, int b) {
        System.out.println("Sum : " + (a + b));
    }

    void printDetails() {
        System.out.println("Hello I'm Printing........");
    }

    // copy constructor
    Student(Student s1) {
        s1.printDetails();
    }

}

public class Constructor {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(10, 20);
        Student s3 = new Student(s2);
    }
}