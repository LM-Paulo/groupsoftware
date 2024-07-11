package org.example;

import org.example.questaoDois.Apartamento;
import org.example.questaoDois.Bloco;
import org.example.questaoTres.Lista;
import org.example.questaoTres.interfaces.Filtro;
import org.example.questaoTres.interfaces.Mapeador;
import org.example.questaoUm.Calculadora;
import org.example.questaoUm.Quadradro;
import org.example.questaoUm.Retangulo;
import org.example.questaoUm.Triangulo;
/**
 * Classe Main que contém o método main para executar exemplos das questões.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Questão 01 ------------------------------------------------------");

        // Cria uma instância da Calculadora para calcular áreas de figuras geométricas
        Calculadora calculadora = new Calculadora();

        // Adiciona diferentes figuras à calculadora
        calculadora.adicionarFigura(new Quadradro(4));
        calculadora.adicionarFigura(new Triangulo(15,20));
        calculadora.adicionarFigura(new Retangulo(6,20));

        // Calcula e imprime as áreas individuais das figuras
        calculadora.areasIndividual();
        calculadora.imprimirFiguras();

        System.out.println("Questão 02 -----------------------------------------------------------------");

        // Cria um bloco de apartamentos
        Bloco bloco = new Bloco();

        // Cria vários apartamentos e os adiciona ao bloco
        Apartamento ap01 = new Apartamento(40);
        Apartamento ap02 = new Apartamento(60);
        Apartamento ap03 = new Apartamento(80);
        Apartamento ap04 = new Apartamento(100);
        bloco.adicionarApartamento(ap01);
        bloco.adicionarApartamento(ap02);
        bloco.adicionarApartamento(ap03);
        bloco.adicionarApartamento(ap04);

        // Define as despesas do bloco
        bloco.definirDespesas(1000);

        // Calcula e imprime o valor do condomínio de cada apartamento
        System.out.println("Valor condominio ap01 : " + bloco.calcularCondominio(ap01));
        System.out.println("Valor condominio ap02 : " + bloco.calcularCondominio(ap02));
        System.out.println("Valor condominio ap03 : " + bloco.calcularCondominio(ap03));
        System.out.println("Valor condominio ap04 : " + bloco.calcularCondominio(ap04));

        System.out.println("Questão 03 -----------------------------------------------------------------");

        // Cria uma lista de inteiros
        int[] elementos = {1, 2, 3, 4};
        Lista lista = new Lista(elementos);

        // Imprime a lista original
        System.out.print("Original: ");
        lista.imprimir();

        // Inverte a lista e a imprime
        Lista reversa = lista.reverse();
        System.out.print("Reversa: ");
        reversa.imprimir();

        // Filtra a lista para incluir apenas números pares e a imprime
        Lista filtrada = lista.filter(new Filtro() {
            @Override
            public boolean aceitar(int valor) {
                return valor % 2 == 0;
            }
        });
        System.out.print("Filtrada: ");
        filtrada.imprimir();

        // Aplica uma transformação na lista multiplicando cada elemento por 2 e a imprime
        Lista mapeada = lista.map(new Mapeador() {
            @Override
            public int mapear(int valor) {
                return valor * 2;
            }
        });
        System.out.print("Mapeada: ");
        mapeada.imprimir();
    }
}