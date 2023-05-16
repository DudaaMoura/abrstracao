public class Principal {
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();

        circulo.setRaio(10);
        System.out.println(circulo.calcularArea());

        Triangulo triangulo = new Triangulo();

        triangulo.setAltura(40);
        triangulo.setBase(30);
        System.out.println(triangulo.calcularArea());

        Quadrada quadrada = new Quadrada();

        quadrada.setLadoA(50);
        quadrada.setLadoB(50);
        System.out.println(quadrada.calcularArea());


    }

    
}
