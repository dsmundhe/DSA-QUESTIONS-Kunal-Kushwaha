class Shape {
    String color;

    Shape(Shape s1) {
        this.color = s1.color;
    }

    Shape() {
    }

    public void printInfo() {
        System.out.println(color);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.color = "Red";
        Shape s2 = new Shape(s1);

        Shape s3 = new Shape(s2);
        s3.printInfo();
    }
}
