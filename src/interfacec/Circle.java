package interfacec;

class Circle implements Shape {
    private double r;
    static double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return PI * (r * r);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }
}
