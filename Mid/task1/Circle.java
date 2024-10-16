import java.lang.*;
public class Circle {
    public double radius;
    public int c;
    public int p;

    public void setRadius(double x) {
        radius = x;
    }

    public void setC(int a) {
        c = a;
    }

    public void setP(int b) {
        p = b;
    }

    public double getRadius() {
        return radius;
    }

    public int getC() {
        return c;
    }

    public int getP() {
        return p;
    }

    public static void main(String args[]) {
        Circle obj = new Circle();
        obj.setRadius(12.8);
        obj.setC(6);
        obj.setP(7);
        System.out.println("Circle radius     : " + obj.getRadius());
        System.out.println("center point      : " +"(" + obj.getC()+" , " + obj.getP()+ ")");
    }

}