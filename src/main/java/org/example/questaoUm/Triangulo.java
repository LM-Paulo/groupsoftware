package org.example.questaoUm;
/**
 * Classe que representa um Triângulo, que é uma figura geométrica.
 * Estende a classe abstrata Figura e implementa o método para calcular a área.
 */
public class Triangulo extends Figura {
    //Base e altura do triangulo
    private double base;
    private double altura;

    /**
     * Construtor para inicializar um Triângulo com base e altura especificadas.
     *
     * @param base   A base do triângulo.
     * @param altura A altura do triângulo.
     */
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula a área do triângulo utilizando a fórmula: (base * altura) / 2.
     * Sobrescreve o método da classe Figura.
     *
     * @return A área do triângulo.
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    /**
     * Retorna uma representação textual do triângulo.
     *
     * @return Uma string representando o triângulo.
     */
    @Override
    public String toString() {
        return "Triangulo";
    }
}
