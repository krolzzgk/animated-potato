package fila1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author karolina.gkallajian
 */
public class Fila {

    public Object fila[];
    private int inicio;
    private int fim;

    public Fila(int t) {
        this.inicio = -1;
        this.fim = -1;
        this.fila = new Object[t];
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    public boolean isEmpty() {
        return (this.inicio == -1) && (this.fim == -1);
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return fila.length;
    }

    public Object enqueue(Object valor) {
        if (fim != fila.length - 1) {
            fila[++fim] = valor;
        }
        return valor;
    }

    public Object dequeue() {
        if (!isEmpty()) {
            Object temp = fila[++inicio];
            fila[inicio] = 0;
            return temp;
        }
        return null;
    }

    public int search(Object dado) {
        for (int i = 0; i < fila.length; i++) {
            if (fila[i] == dado) {
                return i;
            }
        }
        return -1;
    }

    public Object front() {
        if (inicio == -1) {
            return fila[++inicio];
        }
        return fila[++inicio];
    }

    public Object back() {
        if (fim != -1) {
            return fila[fim];
        }
        return null;
    }
    
    public void mostrarFila(){
        for (int i = 0; i < fila.length; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println("");
    }
}
