package Ejercicio11;
abstract class Figura {
    private String color;
    private boolean relleno;
    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isRelleno() {
        return relleno;
    }
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
}
