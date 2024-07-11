package org.example.questaoUm;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe Calculadora gerencia uma lista de figuras geométricas
 * e fornece métodos para adicionar figuras, calcular a área total
 * de todas as figuras e imprimir as áreas das figuras.
 */
public class Calculadora {

    // Lista de figuras geométricas
    private List<Figura> Figuras;

    /**
     * Construtor da classe Calculadora.
     * Inicializa a lista de figuras como uma nova ArrayList.
     */
    public Calculadora() {
        Figuras = new ArrayList<>();
    }

    /**
     * Adiciona uma figura à lista de figuras.
     *
     * @param figura a figura a ser adicionada.
     */
    public void adicionarFigura(Figura figura) {
        Figuras.add(figura);
    }

    /**
     * Calcula a área total de todas as figuras na lista.
     *
     * @return a área total de todas as figuras.
     */
    public double calcularAreaTotal() {
        double area = 0;
        for (Figura figura : Figuras) {
            area += figura.calcularArea();
        }
        return area;
    }

    /**
     * Imprime a área total de todas as figuras na lista.
     */
    public void imprimirFiguras() {
        System.out.println("Area total de todas as figuras: " + calcularAreaTotal());
    }

    /**
     * Imprime a área de cada figura individualmente.
     */
    public void areasIndividual(){
        for (Figura figura : Figuras) {
            System.out.println(figura.toString() + ": " + figura.calcularArea());
        }
    }

}
