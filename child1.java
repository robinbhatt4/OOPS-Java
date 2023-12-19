class child{
    int id=5;
    String name="sharma";
    }
class child1 {
    public static void main(String[] args)
    {
        child s1=new child();
        child s2=new child();
        s2.id=6;                    //initialization through reference
        s2.name="satyam";           //initialization through reference
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.name+" "+s1.name);
    }
    
}
