public class dogtestdrive {

    public static void main(String[] args)
    {
        dog d =new dog();
        d.size=40;
        d.bark();
        System.out.println(d.size);

    }
}
class dog{
    int size;
    String breed;
    String name;
    void bark()
    {System.out.println("ruff");}

}
