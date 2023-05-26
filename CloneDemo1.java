class CloneTest
{
    int i=10;
}
public class CloneDemo1 implements Cloneable
{
    int j=20;
    CloneTest ob=new CloneTest();
    public static  void main(String[]args) throws CloneNotSupportedException
    {
        CloneDemo1 c1=new CloneDemo1();
        CloneDemo1 c2=(CloneDemo1)c1.clone();
        System.out.println("Program of shallow Cloning ");
        System.out.println("Original object values "+c1.ob.i+" "+c1.j);
        System.out.println("Cloned object values "+c2.ob.i+" "+c2.j);
        c2.ob.i=11;
        c2.j=21;
        System.out.println("Original object values "+c1.ob.i+" "+c1.j);
        System.out.println("Cloned object values "+c2.ob.i+" "+c2.j);
    }
}