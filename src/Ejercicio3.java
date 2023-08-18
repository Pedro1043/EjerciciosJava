import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese el consumo de agua(litros)");
        Scanner input = new Scanner(System.in);
        int litros = input.nextInt();
        float costo = 10;
        float costo2 =0;
        float litrosRestantes;
        float litrosRestantes2;
        if(litros >= 51){
            litrosRestantes = litros-50;
            costo = (float) (10+(0.5*litrosRestantes));
        }
        if(litros >= 200){
            litrosRestantes2 = litros-200;
            costo2 = (float) (1.5*litrosRestantes2);
        }
        System.out.println("$"+(costo+costo2));
    }
}
