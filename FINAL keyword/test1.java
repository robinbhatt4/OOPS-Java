class test1{
     int speedlimit=90;
     int speedlimit2=100;
    void run()
    {
       final speedlimit2=50;   //cannot override final
        speedlimit=40;
        System.out.println(speedlimit); 
        System.out.println(speedlimit2);    
    }

        public static void main(String [] args)
        {
            test1 obj= new test1();
            obj.run();

        }
        }
