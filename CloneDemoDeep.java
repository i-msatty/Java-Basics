class  CloneTest11
{
    int i=10;
}
public class CloneDemoDeep implements Cloneable
{
    int j=20;
    CloneTest11 ob=new CloneTest11();
    public Object clone() throws CloneNotSupportedException
    {
        ob=new CloneTest11();
        CloneDemoDeep cdobj=new CloneDemoDeep();
        cdobj.ob.i=33;
        cdobj.j=44;
        return cdobj;
    }
    public static void main(String [] args) throws CloneNotSupportedException
    {
        CloneDemoDeep c1=new CloneDemoDeep();
        CloneDemoDeep c2=(CloneDemoDeep)c1.clone();
        System.out.println("Program of Deep Demo "+c1.ob.i+" "+c1.j);
        System.out.println("Cloned object values "+c2.ob.i+" "+c2.j);
        c2.ob.i=11;
        c2.j=21;
        System.out.println("Program of Deep Demo "+c1.ob.i+" "+c1.j);
        System.out.println("Cloned object values "+c2.ob.i+" "+c2.j);
    }
}