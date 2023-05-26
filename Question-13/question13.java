class Student{
    int roll;
    void getnumber(int n){
        roll=n;
    }
    void putnumber(){
        System.out.println("Roll number: "+roll);
    }
}
class test extends Student{
    float m1,m2;
    void getmarks(float m1,float m2){
        this.m1=m1;
        this.m2= m2;
    }
    void putmarks(){
        System.out.println("Marks obtained");
        System.out.println("Marks 1:"+m1);
        System.out.println("Marks 2: "+m2);
    }
}
interface sports{
    float sportwt=60;
    void putwt();
}
class results extends test implements sports{
    float total;
    public void putwt(){
        System.out.println("Sports marks: "+sportwt);
    }
    void display(){
        total = m1+m2+sportwt;
        putnumber();
        putmarks();
        putwt();
        System.out.println("Total score:"+total);
    }
}
public class question13 {
    public static void main(String[] args) {
        results r = new results();
        r.getnumber(027);
        r.getmarks(69, 72);
        r.display();
    }
}
