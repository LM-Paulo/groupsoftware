package org.example.questaoTres;

import org.example.questaoTres.interfaces.Filtro;
import org.example.questaoTres.interfaces.Mapeador;

/**
 * A classe Lista representa uma estrutura de lista de inteiros que permite
 * operações como inversão, filtragem e mapeamento dos elementos.
 */
public class Lista{

    // Array de inteiros que armazena os elementos da lista
    private int[] elementos;

    /**
     * Construtor da classe Lista.
     *
     * @param elementos um array de inteiros contendo os elementos da lista.
     */
    public Lista(int[] elementos) {
        this.elementos = elementos;
    }

    /**
     * Inverte a ordem dos elementos na lista.
     *
     * @return uma nova Lista com os elementos em ordem inversa.
     */
    public Lista reverse() {
        int[] reversed = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            reversed[i] = elementos[elementos.length - 1 - i];
        }
        return new Lista(reversed);
    }

    /**
     * Filtra os elementos da lista de acordo com o critério definido pelo filtro.
     *
     * @param filtro o filtro a ser aplicado aos elementos da lista.
     * @return uma nova Lista contendo apenas os elementos que atendem ao critério do filtro.
     */
    public Lista filter(Filtro filtro) {
        int[] temp = new int[elementos.length];
        int count = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (filtro.aceitar(elementos[i])) {
                temp[count++] = elementos[i];
            }
        }
        int[] filtered = new int[count];
        System.arraycopy(temp, 0, filtered, 0, count);
        return new Lista(filtered);
    }

    /**
     * Mapeia os elementos da lista para novos valores de acordo com a implementação do mapeador.
     *
     * @param mapeador o mapeador a ser aplicado aos elementos da lista.
     * @return uma nova Lista contendo os elementos mapeados.
     */
    public Lista map(Mapeador mapeador) {
        int[] mapped = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            mapped[i] = mapeador.mapear(elementos[i]);
        }
        return new Lista(mapped);
    }

    /**
     * Imprime os elementos da lista no console.
     */
    public void imprimir() {
        for (int i : elementos) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

