package praticando.metodos;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício Caculadora\n");
        
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        System.out.println("\nExercício Mensagem\n");

        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("\nExercício Empréstimo\n");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        System.out.println("\nExercício Quadrilatero\n");

        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(7f, 9f);

        System.out.println("\nExercício Retornos\n");

        double areaQuadrado = MetodoComReturno.area(3.0);
        System.out.println("Área do quadrado: " + areaQuadrado);

        int areaRetangulo = MetodoComReturno.area(5, 5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        float areaTrapezio = MetodoComReturno.area(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);
        
        
    }
}
