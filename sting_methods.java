public class sting_methods {
    public static void main(String[] args){
       String b = "This is my sentence"; 
        System.out.println(b);

        /* Methods in String */
        
        System.out.println(b.contains("my")); //return true / false
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(b.startsWith("this"));
        System.out.println(b.endsWith("ce"));
        System.out.println(b.indexOf("s"));
        System.out.println(b.indexOf("z"));
        System.out.println(b.charAt(9));
        System.out.println(b.replace("my","our"));
    }
    
}
