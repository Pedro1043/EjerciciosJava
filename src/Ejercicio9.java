import java.util.Random;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N: ");
        int n = input.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
           array[i] = random.nextInt(33);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        int[] arrayInvertido = new int[n];
        int z=0;
        for (int y=n-1;y>=0;y--){
            arrayInvertido[z] = array[y];
            z++;
        }
        for (int i : arrayInvertido) {
            System.out.print(i + " ");
        }
    }
}