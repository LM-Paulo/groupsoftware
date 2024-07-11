package org.example.questaoUm;
/**
 * A classe abstrata Figura representa uma figura geométrica.
 * Esta classe define um método abstrato para calcular a área da figura.
 */
public abstract class Figura {

    /**
     * Método abstrato para calcular a área da figura.
     * Cada subclasse concreta deve implementar este método.
     *
     * @return a área da figura.
     */
    public abstract double calcularArea();
}
