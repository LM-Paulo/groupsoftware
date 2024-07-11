package org.example.questaoTres.interfaces;
/**
 * A interface Filtro define um método para verificar se um valor inteiro
 * atende a um critério específico.
 */
public interface Filtro {

    /**
     * Verifica se o valor fornecido atende ao critério definido pelo filtro.
     *
     * @param valor o valor a ser verificado.
     * @return true se o valor atender ao critério, false caso contrário.
     */
    boolean aceitar(int valor);
}