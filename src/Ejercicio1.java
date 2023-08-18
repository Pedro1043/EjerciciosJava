import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int precioPorHora = 40;
        int dineroGanado;
        System.out.println("Ingrese las horas trabajadas");
        Scanner input = new Scanner(System.in);
        int horasTrabajadas = input.nextInt();
        if (horasTrabajadas>40){
            int horasExtras = horasTrabajadas - 40;
            horasTrabajadas = 40;
            if(horasExtras>8){
                int he1 = 8*2*precioPorHora; //Primeras 8 horas el doble
                int he2 = ((horasExtras - 8)*3)*precioPorHora;//Las que sobran el tripe
                dineroGanado = (precioPorHora*horasTrabajadas) + he1 + he2;
            }else{
                dineroGanado = (precioPorHora*horasTrabajadas) + horasExtras*precioPorHora*2;
            }
        }else{
            dineroGanado = precioPorHora*horasTrabajadas;
        }
        System.out.println("$"+dineroGanado);
        input.close();
    }
}
