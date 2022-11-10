/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package microC;

/**
 * CLASE PARA ARMAR EL ARBOL
 * @author cris
 * Parte 1. Analisis sintactico
 * Parte 2. Analisis semantico
 * Parte 3. Codigo Intermedio
 * Parte 4. Codigo Objeto
 
 **/
public class Nodo {
    //Atributos
    private String dato;
    private Nodo padre, izquierdo, derecho;
    private String codigoIntermedio;
    private String lugar; //Para los temporales

    public Nodo(String dato, Nodo padre, Nodo izquierdo, Nodo derecho, String codigoIntermedio, String lugar) {
        this.dato = dato;
        this.padre = padre;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
        this.codigoIntermedio = codigoIntermedio;
        this.lugar = lugar;
    }

        
    public Nodo(Nodo derecho, String dato,Nodo izquierdo){
        this.derecho=derecho;
        this.dato= dato;
        this.izquierdo = izquierdo;
        this.padre = null;
        this.codigoIntermedio = "";
        this.lugar = "";
    }
    
    public Nodo(String informacion){
    this.dato = informacion;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public String getCodigoIntermedio() {
        return codigoIntermedio;
    }

    public void setCodigoIntermedio(String codigoIntermedio) {
        this.codigoIntermedio = codigoIntermedio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
