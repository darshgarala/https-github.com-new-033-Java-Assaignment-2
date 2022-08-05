import java.util.Scanner;
public class P_5 {
public static void information(String roll_no,String name,String branch)
    {
        System.out.println("The name of the Student is  :"+name);
        System.out.println("The roll no of the student is  "+roll_no);
        System.out.println(name+ " studies in "+branch);
    }
    public static void information(String name ,String degree, String faculty_of,int experience,long salary)
    {
        System.out.println("Name of the professor is  :"+name);
        System.out.println(name+" has compleated "+degree);
        System.out.println(name+ "have "+experience+" years of teaching");
        System.out.println(name+ " teaches in "+faculty_of);
        System.out.println(name+ " has been given "+salary+" rs of salary per year");
    }
}
