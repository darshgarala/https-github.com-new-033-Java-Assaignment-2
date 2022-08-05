import java.util.*;
public class P_1 {
    static double radius;
    P_1()
    {
        radius = 1;//Default constructur for default value of the radius.
    }
    P_1(double r)
    {
        radius = r;//Parameterized constructur to assign the value of the radius.
    }
    public static double getArea()
    {
        double area = ((double)3.14)*radius*radius;//method to calculate the area of the circle
        return area;
    }
    public static double getPerimeter()
    {
        double peri;
        peri = 2*((double)3.14)*radius;//method to calculate the perimeter of the circle
        return peri;
    }
}
