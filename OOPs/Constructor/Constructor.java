
class Animal {
    String name;
    String color;
    int weight;

    // Parametric Constructor
    Animal(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Weight : " + weight);
    }

}

public class Constructor {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog", "Black", 45);
        Animal tiger = new Animal("Tiger", "Yellow & Black ", 210);
        dog.printInfo();
        tiger.printInfo();

    }
}
