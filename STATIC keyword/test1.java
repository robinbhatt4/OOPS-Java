class test1{
    int count=0;
    test1(){
        count++;                // increment the value everytime it is called
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        test1 obj=new test1();
        test1 obj1=new test1();
        test1 obj2=new test1();
        test1 obj3=new test1();
    }
}