public class question14 {
    public static void main(String[] args) {
        try{
            int num=4,deno=0;
            int quotient = num/deno;
            System.out.println(quotient);
        }
        catch(ArithmeticException e){
            System.out.println("Not defined");
        }
        finally{
            System.out.println("All exception handled");
        }
    }
}
