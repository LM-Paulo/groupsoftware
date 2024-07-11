package org.example.questaoTres.interfaces;

/**
 * A interface Mapeador define um método para transformar um valor inteiro
 * em outro valor inteiro.
 */
public interface Mapeador {

    /**
     * Transforma o valor fornecido em um novo valor de acordo com a implementação do mapeador.
     *
     * @param valor o valor a ser transformado.
     * @return o novo valor transformado.
     */
    int mapear(int valor);
}
