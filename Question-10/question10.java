import java.io.*;
class Box{
    int length,breadth,depth;
    Box(){
        length=breadth=-1;
    }
    Box(int l,int b,int h){
        length=l;
        breadth=b;
        depth=h;
    }
    Box(int n){
        length=breadth=depth=n;
    }
    void volume(){
        System.out.println("Volume: "+length*breadth*depth);
    }
}
class box_new extends Box{
    int weight;
    box_new(int l,int b,int d,int w){
        super(l,b,d);
        weight=w;
    }
    void show(){
        System.out.println("Weight: "+weight);
    }

}
class question10{
    public static void main(String args[]){
        box_new b1=new box_new(1,2,3,4);
        b1.show();
        b1.volume();
    }
}
