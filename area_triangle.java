import java.util.*;
import java.lang.Math;
class area_triangle{
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the 3 sides of traingle");
        System.out.print("Enter first number- ");  
        int a= obj.nextInt();  
        System.out.print("Enter second number- ");  
        int b= obj.nextInt();  
        System.out.print("Enter third number- ");  
        int c= obj.nextInt(); 
        int s=(a+b+c);
        double area;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.print("The area is-> "+area);  
    }
}