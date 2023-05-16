public class Quadrada extends Forma{
    
    private double ladoB;
    private double ladoA;

    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double calcularArea(){
        return ladoA * ladoB;
    }
}
