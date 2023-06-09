class NoMatchException extends Exception{
    private String s;
    NoMatchException(String str){
        s = str;
    }
    public String toString(){
        return s;
    }
}
public class question_17{
    public static void compute(String s) throws NoMatchException{
        System.out.println("Country: "+ s);
        if(s != "India"){
            throw new NoMatchException(s);
        }
        System.out.println("Normal Exit");
    }
    public static void main(String[] args) {
        try{
            String s1 = "India";
            String s2 = "America";
            compute(s1);
            compute(s2);
        }
        catch(NoMatchException e){
            System.out.println("Exception Caught in " + e);
        }
    }
}
