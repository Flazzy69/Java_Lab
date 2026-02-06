class Outer{
    int data=100;
    public void display()
    {
        System.out.println("display Data:"+data);
    }
    public class inner{
        public void show()
{
    System.out.println("Inner class show Data:"+data);
}    
}
}
public class NestedEx{
    public static void main(String[]args){
        Outer obj=new  Outer();
        Outer.inner iobj=obj.new inner();
        iobj.show();
    }
}