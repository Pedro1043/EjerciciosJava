import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(500);
            System.out.println("El elemento "+i+" es: "+array[i]);
        }
        input.close();
    }
}
