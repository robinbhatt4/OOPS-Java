package Inheritance;
class employee{
    float cost=23000;
}

 class single extends employee {
     float discount=2000;
    public static void main(String[]args)
    {
        single obj=new single();
        System.out.println("Cost-> "+ obj.cost);
        System.out.println("Discount-> "+ obj.discount);
        
    }
    
}
