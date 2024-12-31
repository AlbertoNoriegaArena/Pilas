package es.santander.ascender;

public class Nodo {
    private String valor;
    private Nodo siguiente; 

    public Nodo addNodo(String nuevoValor) {
        Nodo nuevoNodo = new Nodo(nuevoValor);
        nuevoNodo.setSiguiente(this); 
        // nuevoNodo pasa a ser la cima (último valor en entrar)
        return nuevoNodo; 
    }

    public Nodo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Nodo getSiguiente() { 
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) { 
        this.siguiente = siguiente;
    }
}
