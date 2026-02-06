class Shape{
    double dim1,dim2;
    public Shape(double d1, double d2){
        dim1=d1;
        dim2=d2;
    }
    public double  area(){
        System.out.println("Undefined Shape=");
        return 0.0;
    }
}
class Triangle extends Shape{
    public Triangle(double b, double h){
        super(b,h);
    }
    public double area(){
        return(0.5*dim1*dim2);
    }
}
public class MethodoverrideEx{
    public static void main(String[]args){
        Triangle t1= new Triangle(5,6);
        double a=t1.area();
        System.out.println("Area of Triiangle="+a);
    }
}