public class except
{
    public static void main(String[] args)
    {
    int i=40,d=0;
    try
    {
        System.out.println(i/d);
        System.out.println("End of try block");
    }catch(ArithmeticException e)
    {
        System.out.println("Divide by zero");
        System.out.println("End of catch block");
    }
    System.out.println("End of main");
}
}