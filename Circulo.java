public class Circulo extends Forma{
    private final float pi = 3.14f;
    private float raio;
    public float calculaArea() {
        return this.pi*(this.raio*this.raio);
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
}
