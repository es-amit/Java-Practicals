//Method overloading
class overloading{
    int length,breadth;
    overloading(){
        length=breadth=-1;
    }
    overloading(int h){
        length=breadth=h;
    }
    overloading(int l,int b){
        length=l;
        breadth=b;
    }
    int area(){
        return length*breadth;
    }
}
// Method Overriding
class A{
    int i,j;
    A(int a, int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i: "+i);
        System.out.println("j: "+j);
    }
}
class B extends A{
    int k;
    B(int a, int b,int c){
        super(a, b);
        k=c;
    }
    void show(){
        super.show();
        System.out.println("k: "+k);
    }
}
class question9{
    public static void main(String args[]){
	System.out.println("--------Method overloading---------");
        overloading obj1=new overloading();
        int area=obj1.area();
        System.out.println("Area: "+area);
        overloading obj2=new overloading(2);
        area=obj2.area();
        System.out.println("Area: "+area);
        overloading obj3=new overloading(5,6);
        area=obj3.area();
        System.out.println("Area: "+area);
        System.out.println("---------Method Overriding---------");
        B obj=new B(4, 3, 42);
        obj.show();
        
    }
}
