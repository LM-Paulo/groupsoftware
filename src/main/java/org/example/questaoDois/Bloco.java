package org.example.questaoDois;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe Bloco representa um bloco de apartamentos em um condomínio.
 * Esta classe gerencia uma lista de apartamentos e as despesas do bloco,
 * e fornece métodos para adicionar apartamentos, definir despesas e calcular
 * o valor do condomínio para cada apartamento.
 */
public class Bloco {

    // Lista de apartamentos no bloco
    private List<Apartamento> apartamentos;

    // Despesas totais do bloco
    private double despesas;

    /**
     * Construtor da classe Bloco.
     * Inicializa a lista de apartamentos como uma nova ArrayList.
     */
    public Bloco() {
        apartamentos = new ArrayList<>();
    }

    /**
     * Adiciona um apartamento à lista de apartamentos do bloco.
     *
     * @param apartamento o apartamento a ser adicionado.
     */
    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    /**
     * Define as despesas totais do bloco.
     *
     * @param despesas o valor das despesas totais do bloco.
     */
    public void definirDespesas(double despesas) {
        this.despesas = despesas;
    }

    /**
     * Calcula o valor do condomínio para um apartamento específico.
     *
     * @param apartamento o apartamento para o qual o valor do condomínio será calculado.
     * @return o valor do condomínio do apartamento especificado.
     */
    public double calcularCondominio(Apartamento apartamento) {
        double area = 0;

        for (Apartamento apt : apartamentos) {
            area += apt.getArea();
        }
        return apartamento.getArea() / area * despesas;
    }
}
