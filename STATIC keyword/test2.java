class test2{
    static int count=0;
    test2(){
        count++;                // increment the value everytime it is called
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        test2 obj=new test2();
        test2 obj1=new test2();
        test2 obj2=new test2();
        test2 obj3=new test2();
    }
}