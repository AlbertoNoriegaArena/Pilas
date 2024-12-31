package es.santander.ascender;

public class Pila {

    private Nodo cima;

    public void add(String mensaje) {
        if (cima == null) {
            this.cima = new Nodo(mensaje);
        } else {
            this.cima = cima.addNodo(mensaje); 
        }
    }

    public String get() {
        if (cima == null) {
            return null;
        } else {
            String valor = cima.getValor(); 
            cima = cima.getSiguiente(); 
            return valor;
        }
    }
}
