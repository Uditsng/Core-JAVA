public class Array {
    public static void main(String[] args){
        //when value to be passed in Array is not declared
        int[] marks = new int[5];
        marks[0] = 90;
        marks[1] = 95;
        marks[2] = 99;
        marks[3] = 98;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        System.out.print("New Array : ");
        int[] mark = new int[]{50,60,70,80};
        System.out.println(mark[2]);
    }
    
}
