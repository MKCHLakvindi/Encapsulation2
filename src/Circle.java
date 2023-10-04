public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);

        System.out.println("Original Radius: " + circle.getRadius());
        circle.setRadius(7.5);
        System.out.println("Updated Radius: " + circle.getRadius());

        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        System.out.println("Area of the Circle: " + area);
        System.out.println("Perimeter of the Circle: " + perimeter);
    }
}
