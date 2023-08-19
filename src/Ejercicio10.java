import java.util.Random;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ir = 0; //intentos realizados
        int x;
        boolean victoria = false;
        Random random = new Random();
        int n = random.nextInt(100)+1;
        //System.out.println(n);
        while (!victoria){
            ir++;
            System.out.println("Ingrese el número: ");
            x = input.nextInt();
            if(x==n){
                System.out.println("¡Felicidades! ¡Haz adivinado el número!");
                System.out.println(ir+" intentos");
                victoria = true;
            }else{
                if (x < n) {
                    System.out.println("Número demasiado bajo, intenta nuevamente");
                } else {
                    System.out.println("Número demasiado alto, intenta nuevamente");
                }
            }
        }
    }
}