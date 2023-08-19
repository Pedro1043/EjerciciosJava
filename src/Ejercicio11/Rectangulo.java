package Ejercicio11;
public class Rectangulo extends Figura{
    private float ancho;
    private float altura;
    public Rectangulo(String color, boolean relleno, float ancho, float altura) {
        super(color, relleno);
        this.ancho = ancho;
        this.altura = altura;
    }
    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public float getAlto() {
        return altura;
    }
    public void setAlto(float altura) {
        this.altura = altura;
    }
    @Override
    public float calcularArea() {
        float ancho = getAncho();
        float altura = getAlto();
        return ancho*altura;
    }
    @Override
    public float calcularPerimetro() {
        float ancho = getAncho();
        float altura = getAlto();
        return 2*(ancho+altura);
    }
}
