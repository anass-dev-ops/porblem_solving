import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String line = sc.next();

        int x=0, y=0;
        for(int i=0; i<line.length(); i++) {
            if(Character.isUpperCase(line.charAt(i))) {
                x++;
            } else {
                y++;
            }
        }

        if(y>=x) {
            System.out.println(line.toLowerCase());
        } else {
            System.out.println(line.toUpperCase());
        }
        
        
    }
}