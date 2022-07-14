package praticando.metodos;

public class MetodoComReturno {

    public static double area(double lado) {

        return lado * lado;
    }

    public static int area(int lado1, int lado2) {

        return lado1 * lado2;
    }

    public static float area(float baseMaior, float baseMenor, float altura) {

       return ((baseMaior + baseMenor)* altura) / 2;
    }
    
}
