class callbyvalue{
    void swap(int i,int j){
        int temp=i;
        i=j;
        j=temp;
        System.out.println("Inside function:");
        System.out.println("a: "+i);
        System.out.println("b: "+j);
    }
}
class callbyref{
    int a,b;
    callbyref(int i,int j){
        a=i;
        b=j;
    }
    void swap(callbyref ob){
        int temp=ob.a;
        ob.a=ob.b;
        ob.b=temp;
    }
}
class question8{
    public static void main(String args[]){
        int a=10,b=20;
        //call by value code
	System.out.println("---------Call by value---------------");
        System.out.println("Before function:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        callbyvalue obj=new callbyvalue();
        obj.swap(a,b);
        System.out.println("After function:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        //call by reference code
	System.out.println("---------Call by Reference---------------");
        System.out.println("Before function:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        callbyref obj2=new callbyref(a,b);
        obj2.swap(obj2);
        System.out.println("After function:");
        System.out.println("a: "+obj2.a);
        System.out.println("b: "+obj2.b);

    }
}
