import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("N: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        int valorMaximo = array[0];
        for (int y=1;y<array.length;y++){
            if(valorMaximo<array[y]){
                valorMaximo = array[y];
            }
        }
        for (int i : array) {
            System.out.println("Valor: " + i + " del array");
        }
        System.out.println(valorMaximo);
        input.close();
    }
}
