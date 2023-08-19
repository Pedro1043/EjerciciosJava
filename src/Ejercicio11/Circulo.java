package Ejercicio11;
public class Circulo extends Figura{
    private int radio;
    public Circulo(String color, boolean relleno, int radio) {
        super(color, relleno);
        this.radio = radio;
    }
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    @Override
    public float calcularArea(){
        float radio = getRadio();
        return (float) (3.1415*radio*radio);
    }
    @Override
    public float calcularPerimetro(){
        float radio = getRadio();
        return (float) (2*3.1415*radio);
    }
}