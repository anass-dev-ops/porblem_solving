import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {

        char a = 'a';
        int ss = a;
        System.out.println(ss);
        
        Scanner sc = new Scanner(System.in);

        String line1 = sc.next();  
        String line2 = sc.next();

        line1 = line1.toLowerCase();
        line2 = line2.toLowerCase();
        int x = 0, y = 0, z = 0, w = 0;
        
        for (int i=0; i<line1.length(); i++) {
            z = line1.charAt(i);
            w = line2.charAt(i);
            x+=z;
            y+=w;
        }

        if(x<y) {
            System.out.println("1");
        }else if(x>y) {
            System.out.println("-1");
        }else {
            System.out.println("0");
        }
        
    }
}