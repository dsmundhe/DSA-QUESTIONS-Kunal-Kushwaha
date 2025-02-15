
//Class 
class Engineer {
    String name;
    int age;
    int roll;
    int regNo;

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll No : " + roll);
        System.out.println("Registration No : " + regNo);
    }
}

public class Student {
    public static void main(String[] args) {

        // Object creation
        Engineer e1 = new Engineer();
        e1.name = "Dipak Samadhan Mundhe";
        e1.age = 22;
        e1.roll = 39;
        e1.regNo = 22070707;

        System.out.println("Student 1 ");
        e1.printInfo();

        Engineer e2 = new Engineer();
        e2.name = "Nitin Mundhe";
        e2.age = 17;
        e2.roll = 20;
        e2.regNo = 101010;
        System.out.println("Stuendt 2");
        e2.printInfo();
    }

}