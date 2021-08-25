import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // String line = sc.next();

       String line = "maroc";

       char le = line.charAt(0);
       le = Character.toUpperCase(le);

       char[] chars = line.toCharArray();

       chars[0] = le;



       System.out.println(chars);
        
        
    }
}