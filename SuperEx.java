class Person1{
    String  name,address;
    public Person1(String n, String a){
        name=n;
        address=a;
    }
    public void display(){
        System.out.println("Name:"+name+"\nAddress:"+address);
    }
}
class Teacher extends Person1{
    String subject;
    public Teacher(String sub, String name, String address){
        subject=sub;
        super(name,address);
    }
    public void show(){
        System.out.println("Subject:"+subject);
        super.display();
    }
}
public class SuperEx{
    public static void main(String[]args){
        Teacher t1= new Teacher ("OOP in Java","Kshitiz","KTM");
        t1.show();
    }
}