import java.awt.*;
public class address {
    public static void main(String[] args){
    //call by value (primitive data type)
        int a = 5;
        int b = a;
        a = 8;
        System.out.println(b);
    

    
    //call by reference (non_primitive data type)
        Point A = new Point(1, 5);
        Point B = A;
        A.x = 9;
        System.out.println(B);
    
    }
}
