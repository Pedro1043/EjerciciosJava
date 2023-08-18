import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++){
            for(int y = 0; y<=i; y++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        input.close();
    }
}
