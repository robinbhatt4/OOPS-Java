import java.util.*;
class calculator{
    public static void main(String[] args)
    {   double result;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int a= obj.nextInt();  
        int b= obj.nextInt();  
        System.out.print("Enter the operation you want to perform ");  
        char opt= obj.next().charAt(0);
        switch(opt)
        {
            case '+': result=a+b;System.out.println(a+" + "+b+" = "+ result);
                    break;
            case '-': result=a-b;System.out.println(a+" - "+b+" = "+ result);
                    break;
            case '*': result=a*b;System.out.println(a+" * "+b+" = "+ result);
                    break;
            case '/': result=a/b;System.out.println(a+" / "+b+" = "+ result);
                    break;  
            case '%': result=a%b;System.out.println(a+" % "+b+" = "+ result);
                    break;   

        }
       
}
}