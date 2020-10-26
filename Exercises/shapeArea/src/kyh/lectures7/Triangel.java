package kyh.lectures7;

public class Triangel implements Shape {
    int a;
    int b;
    int c;

    public Triangel (int a, int b, int c) {
        System.out.println(a + b + c);
        getArea();
        getCircumference();
    }

    public int getArea() {
        return this.a+b+c;
    }

    public int getCircumference() {
        return this.a*b;

    }
}