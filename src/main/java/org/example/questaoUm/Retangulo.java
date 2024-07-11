package org.example.questaoUm;
/**
 * A classe Retangulo representa um retângulo e herda da classe Figura.
 * Esta classe fornece métodos para calcular a área do retângulo.
 */
public class Retangulo extends Figura {

    // A largura e a altura do retângulo
    private double largura;
    private double altura;

    /**
     * Construtor da classe Retangulo.
     *
     * @param largura a largura do retângulo.
     * @param altura a altura do retângulo.
     */
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    /**
     * Calcula a área do retângulo.
     *
     * @return a área do retângulo.
     */
    @Override
    public double calcularArea() {
        return altura * altura;
    }

    /**
     * Retorna uma representação em string do retângulo.
     *
     * @return a string "Retangulo".
     */
    @Override
    public String toString() {
        return "Retangulo";
    }
}
