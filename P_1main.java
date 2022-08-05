public class P_1 {
public static void main(String[] args)
    {
        double radius,area,peri;
        Scanner s= new Scanner(System.in);

        System.out.print("Enter the radius of the circle  :");
        radius = s.nextDouble();

        P_1 d1 = new P_1(radius);
        area = P_1.getArea();
        peri = P_1.getPerimeter();
        
        System.out.println("The area of the given circle is  :"+area);
        System.out.println("The perimeter of the given circle is  :"+peri);
    }
}
