package Ejercicio11;
public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("rojo",true,2);
        Rectangulo rectangulo = new Rectangulo("rojo",false,20,40);
        Triangulo triangulo = new Triangulo("rojo",true,12,13,14);
        System.out.println("Area del circulo: "+circulo1.calcularArea());
        System.out.println("Perimetro del circulo: "+circulo1.calcularPerimetro());
        System.out.println("Area del rectangulo: "+rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo"+rectangulo.calcularPerimetro());
        System.out.println("Area del triangulo: "+triangulo.calcularArea());
        System.out.println("Perimetro del triangulo: "+triangulo.calcularPerimetro());
    }
}