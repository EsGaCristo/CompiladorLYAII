/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;

public class AnalisisSemantico {
    //Atributos
    HashMap<String, String> tablaSimbolos; 
    //Métodos
    public AnalisisSemantico() {
        tablaSimbolos = new HashMap<>(); 
    }//Constructor
    public void agregaValex(String lexema, String valor){ //
        tablaSimbolos.put(lexema,valor);
    }//agregaValex
     public void print(double e){ //print (E.val) L.val = E.val
        System.out.println("L= "+e);
    }//print
    public double suma(double e,double l){   //E.val = E1.val + T.val
       return e+l;
    }//suma  -------------------
    public double multi(double e,double l){   //E.val = E1.val * T.val
        return e*l;
    }//multi -------------------
    public double resta(double e,double l){     //E.val = E.val - T.val
        return e-l;
    }//resta
    public double exponente(double e,double l){ //E.val = E.val ^ T.val
        return Math.pow(e, l);
    }//Exponente
    public String valex(String lexema){         //F.val=digito.valex
        return tablaSimbolos.get(lexema);
    }//Valex
    
    public static void main(String[] args) {
       //Diseñe una ejecución de las reglas semánticas
       //Suponga la cadena 
       //L=3*5+4;
       //Suponga que se tiene el árbol sintáctico 
       // 1. Agregué a la Tabla de símbolos digito1, dígito2, digito3
       //   ¿Qué más? 
       AnalisisSemantico obj = new AnalisisSemantico();
       // SECCIÓN DE ANÁLISIS SINTÁCTICO
       obj.agregaValex("digito1","3");
       obj.agregaValex("digito2","5");
       obj.agregaValex("digito3","4");
       obj.agregaValex("L", "0");
       obj.agregaValex("F", "0");
       obj.agregaValex("T", "0");
      
       
       //Iniciar con las reglas semánticas
       //2.digito.valex=3 OBTENER EL VALOR DE LA TABLA DE SÍMBOLOS
       //******* LADO IZQUIERDO DEL NODO ***********
       obj.agregaValex("F",obj.valex("digito1"));   // F.val =digito.valex
       
       obj.agregaValex("T",obj.valex("F"));         // T.val = F.val
       
       obj.agregaValex("F",obj.valex("digito2"));   // F.val = digito.valex
       //T.val = 15
       obj.agregaValex("T",
               String.valueOf(Double.parseDouble(obj.valex("T"))*Double.parseDouble(obj.valex("F"))));
       //obj.agregaValex("T", String.valueOf(obj.multi(Double.parseDouble(obj.valex("T")),Double.parseDouble(obj.valex("F")) )));
       System.out.println("T.val = "+obj.valex("T"));
       
       obj.agregaValex("E", obj.valex("T"));        //E.val = T.val
       // ******LADO DERECHO *** DEL NODO
       obj.agregaValex("F", obj.valex("digito3"));  // F.val = 4
       obj.agregaValex("T",obj.valex("F"));         //T.val = F.val
       System.out.println("T.val = "+obj.valex("T"));
       //
       obj.agregaValex("E",String.valueOf(Double.parseDouble(obj.valex("E"))+Double.parseDouble(obj.valex("T"))));
       obj.agregaValex("L",obj.valex("E"));         // E.val = 19
       System.out.println("L.val = "+obj.valex("L"));
    }//main
    
}//Analisis Semántico