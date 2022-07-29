public class Criscle {
    private double radius = 1.0;
    private String color = "red";

    public Criscle() {

    }

    public Criscle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius*radius;
    }
    public double setArea(){
        double area = Math.PI * radius*radius;
        return area;
    }
    public String display(){
        return "color: " + this.color + ", radius: " + this.radius;
    }

}
