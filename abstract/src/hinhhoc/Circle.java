package hinhhoc;
public abstract class Circle extends Shape {
    private double radius;
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, String fill) {
        this.radius = radius;
        this.color = color;
        this.fill = fill;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
