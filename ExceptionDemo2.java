class MyException extends Exception // user defined exception class
{
    public String toString()
    {
        return "MyException1 Occured";
    }
}
public class ExceptionDemo2 /// main class
{
    public static void fun() throws MyException   //user defined fun which throws my exception
    {
        throw new MyException();
    }
    public static void main(String[]args) 
    {
        try{
            fun();
        }catch(MyException exc)
        {
            System.out.println(exc);
        }
    }
}