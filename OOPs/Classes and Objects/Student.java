class Animal {
  String name;
  String type;
  String movement;

  void printDetails() {
    System.out.println("Name : " + this.name);
    System.out.println("Type : " + this.type);
    System.out.println("Movement : " + this.movement);
  }

  Animal(String name, String type, String movement) {
    this.name = name;
    this.type = type;
    this.movement = movement;
  }

  Animal() {

  }
}

public class Student {

  public static void main(String[] args) {
    Animal a1 = new Animal();
    a1.name = "Dog";
    a1.type = "Pet";
    a1.movement = "Run Walk Sprint";
    a1.printDetails();
    Animal a2 = new Animal("Tiger", "Wild", "Run Walk Sprint");
    a2.printDetails();

  }
}
