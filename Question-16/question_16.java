import java.util.*;
public class question_16{
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.addElement(1);
        vec.addElement(2);
        vec.addElement(3);
        vec.addElement(4);
        vec.addElement(5);
        System.out.println("Vector: "+vec);
        System.out.println("Size of Vector: "+vec.size());
        System.out.println("Element at 3: "+vec.elementAt(3));
        vec.removeElementAt(2);
        System.out.println("After removing element: "+vec);
    }
}
