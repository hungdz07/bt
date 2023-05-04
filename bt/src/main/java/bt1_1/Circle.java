package bt1_1;

public class Circle {
    private  double r = 1.0;
    private String color = "red";

    public Circle(){

    }

    public Circle(double r){
        this.r = r;
        color = "red";
    }

    public double getR() {
        return r;
    }
    public double getArea() {
        return r * r * Math.PI;
    }
}
