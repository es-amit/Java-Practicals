import java.io.*;
class Box{
    int length,breadth,height;
    Box(){
        length=height=breadth=-1;
    }
    Box(int n){
        length=height=breadth=n;
    }
    Box(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    void volume(){
	System.out.println("Volume: "+length*breadth*height);
    }
}
class question6{
    public static void main(String args[]){
        Box obj=new Box(2,3,4);
        obj.volume();
        Box obj2=new Box(3);
        obj2.volume();
        Box obj3= new Box();
        obj3.volume();
    }
}
