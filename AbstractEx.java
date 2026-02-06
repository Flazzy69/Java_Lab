abstract class Shape{
    public int dim1 , dim2;
    public Shape (int  d1, int d2){
        dim1=d1;
        dim2=d2;
    }
    public abstract int area();
}
class Rectangle extends Shape{
    public  Rectangle(int l, int b)
    {
        super(l,b);
    }
    public int area(){
        return dim1*dim2;
    }
}
public class AbstractEx{
    public static void main(String[]args){
        Rectangle r1=new Rectangle(6,7);
        System.out.println("Area of rectangle ="+r1.area());
    }
}