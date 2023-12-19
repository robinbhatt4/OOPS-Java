import java.util.*;
public class reverse_string {
    public static void main(String[]args)
    {   String rev="";
        char chr;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=obj.nextLine();
        for(int i=0;i<str.length();i++)
        {   chr=str.charAt(i);
            rev+=chr;
        } 
        System.out.println("Reversed string "+rev);
    }
    
}
