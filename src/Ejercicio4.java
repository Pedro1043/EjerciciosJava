import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese n: ");
        int n = input.nextInt();
        int contador1 = 1;
        while(contador1<=n){
            if(esInpar(contador1)){
                System.out.println(contador1);
            }
            contador1++;
        }
        input.close();
    }
    public static boolean esInpar(int numero){
        return numero % 2 != 0;
    }
}