import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("The area of the rectangle is: " + calculateArea());
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth (width) of the rectangle: ");
        double breadth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, breadth);

        rectangle.displayArea();

        scanner.close();
    }
}
