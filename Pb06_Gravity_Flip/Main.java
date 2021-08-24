import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] cubes = new int[n];
        int p = 0;

        for (int i=0; i<n; i++) {
            cubes[i] = sc.nextInt();
        }

        for(int j=n; j>0 ; j--) {
            for(int i=0; i<(j-1); i++) {
                if(cubes[i+1]<cubes[i]) {
                    p = cubes[i];
                    cubes[i] = cubes[i+1];
                    cubes[i+1] = p;
                }
            }
        }
        
        for(int c: cubes) {
            System.out.print(c+" ");
        }   
    }
}