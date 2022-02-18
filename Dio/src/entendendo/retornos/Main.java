package entendendo.retornos;

/**
 * Retornos
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("* Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("** Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("*** Área do Trapézio: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(4,6);
        System.out.println("**** Área do Losango: " + areaLosango);

    }

//    public static void xpto(){
//        System.out.println("Antes");
//        return;
//    }

    //Erro de compatibilidade entre long e double(1.6)
//    public static long abc(){
//        return 1.6;
//    }
}
