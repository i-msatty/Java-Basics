import java.io.*;
import java.util.Scanner;
public class DemoFile1
{
    public static void main(String[] args) throws IOException
    {
        String ch;
        int data;
        FileInputStream fin=null;
        FileOutputStream fo=null;
        Scanner sc=new Scanner(System.in);
        try
        {
            fo = new FileOutputStream("abc.txt");
            ch=sc.nextLine();
            for(int j=0;j<ch.length();j++)
            {
                ch=sc.nextLine();
            }
            for(int j=0;j<ch.length();j++)
            {
                fo.write(ch.charAt(j));
            }
        }
        catch(IOException e)
        {
            System.out.println("IOException"+e);
        }
        finally
            {
                try
                {
                    if(fo!=null)
                        fo.close();
                }
                catch(IOException e)
                {
                    System.out.println(e);
                }
                try
                {
                    fin=new FileInputStream("abc.txt");
                    while((data=fin.read())!=-1)
                    {
                        System.out.println((char)data);
                    }
                }
                catch(IOException e)
                {
                    System.out.println("IOException e");
                }
                finally
                {
                    try
                    {
                        if(fin!=null)
                        {
                            fin.close();
                            sc.close();
                        }
                    }
                    catch(IOException o)
                    {
                        System.out.println(o);
                    }
                }
            }
        }
    }