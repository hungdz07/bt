package bt1_2;


public class Circle {
    private  double r = 1.0;

    public Circle(){

    }
    public Circle(double r){
        this.r = r;

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea(){
        return r * r * Math.PI;
    }

    public double getCircumference(){
        return 2 * r * Math.PI;
    }

    @Override
    public String toString() {
        return "anotherCircle{" +
                "radius=" + r +
                '}';
    }
}
