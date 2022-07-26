package Retornos.dio;

public class Main {
    public static void main(String[] args) {

        //retornos
        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilateros.area(3);
        System.out.println("Area do Quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilateros.area(5,5);
        System.out.println("Area do Retangulo:" + areaRetangulo);

        double areaTrapezio = Quadrilateros.area(7,8,9);
        System.out.println("Area do Trapézio:" + areaTrapezio);

    }
}
