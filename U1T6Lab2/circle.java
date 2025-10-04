public class circle {
    private double radius;
    public circle(double r) {
        radius = r;
    }
    public void printArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}
