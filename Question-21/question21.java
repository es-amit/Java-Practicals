public class question21 {
    public static void main(String[] args) {
        String str1="Amit";
        String str2="Singh";
        System.out.println(str1.equals(str2));

        str1="   Amit Singh   ";
        System.out.println(str1.trim());

        System.out.println(str1.length());

        System.out.println(str1.substring(2, 10));
        
        str1="amit";
        str2="Amit";
        System.out.println(str1.compareTo(str2));
    }
}
