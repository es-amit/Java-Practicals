import java.lang.Thread;
class even extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2 == 0){
                System.out.println(i+ " is an even number.");
            }
        }
    }
}
class odd extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            if(i%2 != 0){
                System.out.println(i+ " is an odd number.");
            }
        }
    }
}
public class question18 {
    public static void main(String[] args) {
        even e1= new even();
        odd o1 = new odd();
        e1.start();
        o1.start();
    }
}
