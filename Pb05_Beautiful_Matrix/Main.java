import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mov = 0;
        firstloop:        
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                int item = sc.nextInt();
                if (item == 1) {
                    mov = Math.abs(3-i) + Math.abs(3-j);
                    break firstloop;
                }
            }
        }
        System.out.println(mov);
    }
}