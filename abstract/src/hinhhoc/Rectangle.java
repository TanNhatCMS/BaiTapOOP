package hinhhoc;
public abstract class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, String fill) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.fill = fill;
    }
    @Override
    public double getArea() {
        return this.width * this.height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
