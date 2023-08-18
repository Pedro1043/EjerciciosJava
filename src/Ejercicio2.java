import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese la edad del usuario:");
        Scanner input = new Scanner(System.in);
        int edad = input.nextInt();
        System.out.println("Ingrese 1 si el invitado trajo regalo; caso contrario, inserte 0:");
        int gif = input.nextInt(); //1 si trajo regalo - 0 no trajo regalo
        if(edad>=15 && gif ==1){
            System.out.println("El invitado si puede ingresar a la fiesta");
        } else if (edad < 15) {
            System.out.println("El invitado si puede ingresar a la fiesta");
        }else{
            System.out.println("El invitado no puede ingresar");
        }
        input.close();
    }
}
