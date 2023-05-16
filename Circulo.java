public class Circulo extends Forma{

    private double raio;

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI*Math.pow(2, raio);
    }


}
