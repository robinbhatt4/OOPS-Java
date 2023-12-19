


class test2{
     int speedlimit=90;
     int speedlimit2=100;
    final void run() // cannot override a fnal method
    {
        System.out.println("final method running");    
    }
}
class test3 extends test2{
void run()
{
    System.out.println("Inherited class running");
}

        public static void main(String [] args)
        {
            test3 obj= new test3();
            obj.run();

        }
}

