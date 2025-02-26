public class GarbageCollection {
    String name;

    public void printName() {
        System.out.println("Name : " + name);
    }

    // @Override
    // protected void finalize() throws Throwable {
    // System.out.println("Garbage collection algorithm HIT");
    // super.finalize(); // Call the superclass finalize method (optional but
    // recommended)
    // }

    public static void main(String[] args) {

        GarbageCollection g1 = new GarbageCollection();
        g1.name = "Dipak Mundhe";
        g1.printName();

    }
}
