public class Retangulo extends Forma {
    private float base, altura;
    public float calculaArea() {
        return this.base*this.altura;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
