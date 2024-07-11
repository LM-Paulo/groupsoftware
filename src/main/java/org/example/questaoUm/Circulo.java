package org.example.questaoUm;

/**
 * A classe Circulo representa um círculo e herda da classe Figura.
 * Esta classe fornece métodos para calcular a área do círculo.
 */
public class Circulo extends Figura {

    // O raio do círculo
    private double radio;

    /**
     * Construtor da classe Circulo.
     *
     * @param radio o raio do círculo.
     */
    public Circulo(double radio){
        this.radio = radio;
    }

    /**
     * Calcula a área do círculo.
     *
     * @return a área do círculo.
     */
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Retorna uma representação em string do círculo.
     *
     * @return a string "Circulo".
     */
    @Override
    public String toString() {
        return "Circulo";
    }
}
