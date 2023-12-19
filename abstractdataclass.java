abstract class employee{
    String names;
    int empid;
    abstract void calculatesalary();
}

class fulltimeemployee extends employee{
    
    int salary;
    fulltimeemployee(String names,int empid,int salary)
    {
        super.names=names;
        super.empid=empid;
        this.salary=salary;
    }
    void calculatesalary()
    {   System.out.println(names+" "+empid+" "+salary+"$");

    }
}
class parttimeemployee extends employee{
    int rate=1000;
    int hour;  
    parttimeemployee(String names,int empid,int hour)
    {   //super(names,empid);
        super.names=names;
        super.empid=empid;
        this.hour=hour;
    }
    void calculatesalary()
    {   System.out.println(names+" "+empid+" "+(hour*rate)+"$");

    }
}
public class abstractdataclass {
    public static void main(String [] args)
    {
        fulltimeemployee obj=new fulltimeemployee("ROBIN", 12,20000);
        parttimeemployee obj2=new parttimeemployee("SUMESH",14,3);
        obj.calculatesalary();
        obj2.calculatesalary();
    }
    
}
