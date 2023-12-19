package Inheritance;
class a{
    int a,b;
    void display()
    {System.out.println("Inside class A ->"+a+" "+b);}
}
class b extends a{
    int c;
    void show()
    {System.out.println("Inside class B ->"+c);}

}
 class single_2 {
    public static void main(String[]args)
    {   b obj= new b();
        obj.a=10;
        obj.b=20;
        obj.c=30;
        obj.display();
        obj.show();
    }
}
