import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String line = sc.next();

        line = line.toLowerCase();

        int count = 0;
        char currentChar = 0;
        
        firstloop:
        for(int i=0; i<line.length(); i++) {
            for(int j=i-1; j>=0; j--) {
                if(line.charAt(j) == line.charAt(i)) {
                    continue firstloop;
                }
            }
            count++;
        }
        
        if((count % 2) == 0 ){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }        
    }
}