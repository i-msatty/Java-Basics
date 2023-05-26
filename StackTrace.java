public class StackTrace
{
    static void check2()
    {
        try {
            int a=5/0;
        } catch (Exception e)
        {
            // TODO: handle exception
        System.out.println("In catch block");
        e.print StackTrace();    
    }
    }
    static void check()
    {
        check2();
    }
    public static void main(String [] args)
    {
        check();
    }
}