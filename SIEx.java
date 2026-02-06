class Person{
    String name,address;
    public void setName(String n){
        name=n;
    }
     public void setAddress(String a){
        address=a;
    }
    public String getName();
    {
        return name;
    }
     public String getAddress();
    {
        return address;
    }
}
class Student extends Person{
    int roll;
    public void setRoll(int r){
        roll=r;
    }
     public int getRoll();
    {
        return roll;
    }
}
public class SIEx{
    public static void main(String[]args)
    {
        Student s=new Student();
        s.setRoll(19);
        s.setName("Kshitiz");
        s.setAddress("Lalitpur");
        
        System.out.println("student Roll="+s.getRoll());
        System.out.println("student Name="+s.getName());
        System.out.println("student Address="+s.getAddress());
    }
}