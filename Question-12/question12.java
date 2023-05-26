import javax.sound.midi.Sequence;

interface Shape{
    double pi= 3.14;
    void area();
    void perimeter();
}
class Rectangle implements Shape{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("Area of rectangle: "+l*b);
    }
    public void perimeter(){
        System.out.println("Perimeter of rectangle: "+2*(l+b));
    }
}
class Square implements Shape{
    int a;
    Square(int a){
        this.a=a;
    }
    public void area(){
        System.out.println("Area of square: "+a*a);
    }
    public void perimeter(){
        System.out.println("Perimeter of square: "+4*a);
    }
}
class Circle implements Shape{
    int r;
    Circle(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("Area of Circle: "+pi*r*r);
    }
    public void perimeter(){
        System.out.println("Perimeter of Circle: "+2*pi*r);
    }
}
public class question12 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 04);
        Circle c1= new Circle(4);
        Square s1=new Square(7);
        r1.area();
        r1.perimeter();
        c1.perimeter();
        c1.area();
        s1.perimeter();
        s1.area();
    }
}
