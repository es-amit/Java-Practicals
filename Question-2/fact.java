class factorial{
  int fact(int n){
    if(n==1){
      return 1;
    }
    return n*fact(n-1);
  }
}
class fact{
 public static void main(String args[]){
    factorial obj1= new factorial();
    int f=obj1.fact(5);
    System.out.println(f+" is factorial of "+n);
 }
}
