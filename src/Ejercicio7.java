import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ingrese el número: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("El Factorial de "+n+" es: "+resolverFactorial(n));
        input.close();
    }
    public static long resolverFactorial(int n){
        long respuesta = 1;
        while(n!=0){
            respuesta = respuesta*n;
            n--;
        }
        return respuesta;
    }
}
