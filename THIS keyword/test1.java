class student1 {
    int rollno;
    String name;
    float fee;
    student1(int rollno,String name,float fee) //parameterised contructor
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class test1
{    public static void main(String[] args)
    {
        student1 s1=new student1(111,"robin",500f);
        student1 s2=new student1(222,"satyam",600f);
        s1.display();
        s2.display();
    }
}