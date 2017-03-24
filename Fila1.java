/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila1;

/**
 *
 * @author karolina.gkallajian
 */
public class Fila1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TesteBusca();
        System.out.println();
        Exercicio1();
        Exercicio5();
    }

    public static void TesteBusca() {
        Fila fila = new Fila(5);

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);

        System.out.println("Posição do dado: " + fila.search(2));
        System.out.println("Posição do dado: " + fila.search(5));
        System.out.println("Dado da primeira posição: " + fila.front());
        System.out.println("Dado da última posição: " + fila.back());
    }

    public static void Exercicio1(){
        Fila fila = new Fila(5);
        
        System.out.println("Início: " + fila.getInicio() +"\tFim: " + fila.getFim());
        System.out.println("Enqueue: " + fila.enqueue('A'));
        System.out.println("Início: " + fila.getInicio() +"\tFim: " + fila.getFim());
        System.out.println("Enqueue: " + fila.enqueue('B'));
        System.out.println("Início: " + fila.getInicio() +"\tFim: " + fila.getFim());
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Início: " + fila.getInicio() +"\tFim: " + fila.getFim());
        System.out.println("Enqueue: " + fila.enqueue('C'));
        System.out.println("Início: " + fila.getInicio() +"\tFim: " + fila.getFim());
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Início: " + fila.getInicio() +"\tFim: " + fila.getFim());
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Início: " + fila.getInicio()+"\tFim: " + fila.getFim());
    }
    
    public static void Exercicio5(){
        Fila fila = new Fila(5);
        
        fila.enqueue(5);
        System.out.println("******");
        fila.enqueue(3);
        System.out.println("******");
        System.out.println(fila.dequeue());
        fila.enqueue(7);
        System.out.println("******");
        System.out.println(fila.front());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.isEmpty());
        fila.enqueue(9);
        System.out.println("******");
        fila.enqueue(7);
        System.out.println(fila.size());
        fila.enqueue(3);
        System.out.println("******");
        fila.enqueue(5);
        System.out.println("******");
        System.out.println(fila.dequeue());
        
        //A linha front no enunciado está incorreta, pois é o valor 3 que está na frente da fila.
        
//        6 -  Qual seria a complexidade de tempo para as operações e inserção e remoção na Fila?
//      //
//7 - Na implementação da TAD Fila, como resolver o problema quando fila estiver cheia e tentarmos inserir um elemento, como descrever esse erro ?
//      //
//8 - E quando a fila estiver vazia e tentarmos retirar algo, como descrever esse erro ?
//
//9 - Explique o motivo de não movimentarmos todos os
//Elementos da fila quando um valor é removido.

    }
}
