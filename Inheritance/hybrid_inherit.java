package Inheritance;

class stream1{
    public void methodstream()
    {
        System.out.println("STREAM");
    }
}
class science extends stream1{
    public void methodscience()
    {
        System.out.println("SCIENCE");
    }
}
class physics extends science{
    public void methodphysics()
    {
        System.out.println("PHYSICS");
    }
}
class chemistry extends science{
    public void methodchemistry()
    {
        System.out.println("CHEMISTRY");
    }
}



public class hybrid_inherit {
    public static void main(String[]args)
    {
        stream1 s1=new stream1();
        science sc=new science();
        physics ph=new physics();
        chemistry ch=new chemistry();
        s1.methodstream();
        sc.methodstream();
        ph.methodstream();
        ch.methodstream();
    }
    
}
