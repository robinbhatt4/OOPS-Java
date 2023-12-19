class shape{
    void calculate_area(){
        System.out.println("Area");
    }
}

class circle extends shape{
    double calculate_area(int r)
    {return (3.14*r*r);}
}
class rectangle extends shape{
    int calculate_area(int l, int b)
    {return l*b;}
}
class method_override{
    public static void main (String [] args)
    {
        circle obj=new circle();
        rectangle obj2=new rectangle();
        System.out.println("The area of circle is-> "+obj.calculate_area(45));
        System.out.println("The area of rectangle is-> "+obj2.calculate_area(2,4));
    }
}