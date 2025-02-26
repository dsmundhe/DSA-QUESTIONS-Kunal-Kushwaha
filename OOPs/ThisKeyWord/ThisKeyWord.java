public class ThisKeyWord {

    String name;
    int age;
    int salary;

    // this keyword refrence of object
    ThisKeyWord(String name, int age, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;

        // initaily it works like
        // obj.name=name'
        // obj.age=age;
        // obj.salary=salary;
    }

    public void printDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        ThisKeyWord t1 = new ThisKeyWord("Dipak Mundhe", 22, 100000000);

        // print by accessing individual value
        System.out.println(t1.name);
        System.out.println(t1.age);
        System.out.println(t1.salary);

        // printing through printDetails() method
        t1.printDetails();

    }
}
