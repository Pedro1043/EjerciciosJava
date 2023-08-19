package Ejercicio11;

public class Triangulo extends Figura{
    private float ladoA;
    private float ladoB;
    private float ladoC;
    public Triangulo(String color, boolean relleno, float ladoA, float ladoB, float ladoC) {
        super(color, relleno);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    public float getLadoA() {
        return ladoA;
    }
    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }
    public float getLadoB() {
        return ladoB;
    }
    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }
    public float getLadoC() {
        return ladoC;
    }
    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }
    @Override
    public float calcularArea() {
        float perimetro = calcularPerimetro();
        float s = perimetro/2;
        float a = getLadoA();
        float b = getLadoB();
        float c = getLadoC();
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return (float) area;
    }
    @Override
    public float calcularPerimetro() {
        float ladoA = getLadoA();
        float ladoB = getLadoB();
        float ladoC = getLadoC();
        return ladoA+ladoB+ladoC;
    }
}
