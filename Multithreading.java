public class Multithreading
{
    public static void main(String[] args) 
    {
        Thread1 t1=new Thread1("FIRST");
        Thread1 t2=new Thread1("SECOND");
        Thread1 t3=new Thread1("THIRD");
        try
        {
            for(int i=5;i>0;i--)
            {
                System.out.println("Main Thread:->"+i);
                Thread.sleep(500);
            }            
        } catch (InterruptedException e) 
        {
            // TODO: handle exception
        System.out.println("Main Thread Interrupted");
        }
        System.out.println("Existing Main Thread");
    }
}

class Thread1 extends Thread
{
    String nm;
    Thread1(String n)
    {
        nm=n;
        System.out.println("Child Thread:->"+this);
    start();
    }
    public void run()
    {
        try {
            for(int i=5;i>0;i--)
            {
                System.out.println("Child Thread:->"+nm+" "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) 
        {
            // TODO: handle exception
        System.out.println("Existing child thread:->"+nm);
        }
    }
}