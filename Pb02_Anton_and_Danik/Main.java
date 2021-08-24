import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String win = scanner.next();

        int acount = 0;
        int dcount = 0;
        for(int i=0; i<n; i++) {
            if(win.charAt(i) == 'A') {
                acount++;
            } else if (win.charAt(i) == 'D') {
                dcount++;
            }
        }
        
        if (acount > dcount) {
            System.out.println("Anton");
        } else if (acount == dcount) {
            System.out.println("Friendship");
        } else {
            System.out.println("Danik");
        }
    }
}