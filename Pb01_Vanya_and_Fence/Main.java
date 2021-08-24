import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input
        Scanner scanner = new Scanner( System.in );
        
        int n = scanner.nextInt();
        int h = scanner.nextInt();

        // treatment
        int count = 0;
        int ai;
        for (int i=0; i<n; i++) {
            ai = scanner.nextInt();
            if (ai > h) {
                count+=2;
            } else {
                count+=1;
            }
        }
        System.out.println(count);
    }
}