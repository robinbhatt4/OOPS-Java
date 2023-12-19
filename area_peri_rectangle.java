import java.util.*;
public class area_peri_rectangle {
    public static void main(String[]args)
    {   Scanner obj=new Scanner(System.in);
        System.out.println("ENter the side of the rectangle");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int area_result=a*b;
        int peri_reslt=2*(a+b);
        System.out.println("ARea-> "+area_result);
        System.out.println("Perimeter-> "+peri_reslt);
 }
}
