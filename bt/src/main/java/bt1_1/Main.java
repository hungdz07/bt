package bt1_1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("r= " + c1.getR() + ", Area= " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getR() + " and area of " + c2.getArea());
    }
}
