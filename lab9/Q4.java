public class Q4 {
    public static void main(String[]args){
        int num = 100;
        Integer obj=num;
        System.out.println("Auto boxing obj=" +obj);
        
        Double d=new Double(3.14);
        double dv=d;
        System.out.println("Auto un-boxing dv=" +dv);
    }
}