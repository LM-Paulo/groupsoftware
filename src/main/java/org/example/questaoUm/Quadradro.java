package org.example.questaoUm;
/**
 * A classe Quadrado representa um quadrado e herda da classe Figura.
 * Esta classe fornece métodos para calcular a área do quadrado.
 */
public class Quadradro extends Figura {

    // O lado do quadrado
    private double lado;

    /**
     * Construtor da classe Quadrado.
     *
     * @param lado o comprimento do lado do quadrado.
     */
    public Quadradro(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula a área do quadrado.
     *
     * @return a área do quadrado.
     */
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    /**
     * Retorna uma representação em string do quadrado.
     *
     * @return a string "Quadrado".
     */
    @Override
    public String toString() {
        return "Quadradro";
    }
}
