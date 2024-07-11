package org.example.questaoDois;
/**
 * A classe Apartamento representa um apartamento com uma determinada área.
 * Esta classe fornece métodos para obter a área do apartamento.
 */
public class Apartamento {

    // A área do apartamento
    private double area;

    /**
     * Construtor da classe Apartamento.
     *
     * @param area a área do apartamento em metros quadrados.
     */
    public Apartamento(double area) {
        this.area = area;
    }

    /**
     * Obtém a área do apartamento.
     *
     * @return a área do apartamento em metros quadrados.
     */
    public double getArea() {
        return area;
    }

}
