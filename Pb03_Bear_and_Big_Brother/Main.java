import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int years = 0;
        for(int i=0; i<10; i++) {
            if(a<=b) {
                a*=3;
                b*=2;
                years++;
            } else {
                System.out.println(years);
                break;
            }
        }
    }
}