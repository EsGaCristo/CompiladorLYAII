/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package microC;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.HashMap;

/**
 INVESTIGACION

Hecho por: Christopher Jair Estrada Garcia
- Que hace la clase Stack?
	- Un objeto de la clase Stack es una pila. Permite almacenar objetos y luego recuperarlos en el orden inverso en el cual se insertaron, es decir, siempre se recupera el último elemento insertado. Para insertar un objeto a la pila se invoca el método push.
- Cuales son sus metodos?
	- La clase Stack tiene varios metodos como lo son
		- push con tipos de datos como int, String,double, float,object etc
		- popInt,popDouble,popString entre otros tipos de pop para los tipos de datos diferentes
		- first que sirve parecido al pop pero no saca el dato si no que solo recupera el valor hasta arriba de la pila
		- size devuelve el tamano de la pila
		- la funcion booleana is
- Que hace el metodo peek Stack?
	- Consulta el valor de encima de la pila pero solo lo consulta sin retirarlo de la pila
- Que hace la clase StringTokenizer?
	- La clase StringTokenizer nos ayuda a dividir un string en substrings o tokens, en base a otro string (normalmente un carácter) separador entre ellos denominado delimitador.
- Que hace el metodo indexOF?
	- El método indexOf() retorna el primer índice en el que se puede encontrar un elemento dado en el array, ó retorna -1 si el elemento no esta presente.
 **/


/**
 *
 * @author cris
 */
public class Arbol {
    
    Stack <Nodo> ArbolNodo;
    Stack<String> caracter; //Identificar e
    final String espacios= "\t";
    final String aritmeticos = "+-*()^=";
    final String variables = "abcdefghijklmnopqrstuvwxyz";
    final String Multiplica = "*";
    private Nodo raiz;

        
    //Listas Dinamicas
    HashMap<String,String> tablaSimbolos;
    HashMap<String,String> erroresSemanticos;
    HashMap<String,String> producciones;
    HashMap<String,String> reglasSemanticas;
    ArrayList<String> reglasEjecutadas;
    HashMap<String,TablaSimbolos> tablaSimbolosSemantica;
    TablaSimbolos TablaSimbolos;
    
    String r,reglaSemantica;
    int paso;
    public void agregarValex(String Lexema, String valor){
       }//agregarValex        

   public Arbol(){
       tablaSimbolos = new HashMap<>();
       erroresSemanticos = new HashMap<>();
       ArbolNodo=  new Stack<>();
       caracter = new Stack<>();
       producciones = new HashMap<>();
       reglasSemanticas = new HashMap<>();
       paso = 0;
       reglaSemantica= ""; r = "";
       reglasEjecutadas = new ArrayList<String>();
       tablaSimbolosSemantica = new HashMap<String,TablaSimbolos>();
            
           } 
    
   public void guardar(){
       paso++;
       r = "r" + paso;
        
       Nodo izquierdo = (Nodo) ArbolNodo.pop();
       Nodo derecho = (Nodo) ArbolNodo.pop();
       String operador  = caracter.peek();
       //System.out.println("Operador: "+operador);
       //Que hace peek()?
       ArbolNodo.push(new Nodo(
               derecho,caracter.pop(),izquierdo));
       
       if(operador.equals("+")){//Es la suma
           String reglaE = "E.nodo = new Nodo(+,E1.nodo,T.nodo)";
           reglasEjecutadas.add("p"+paso+" "+reglaE);
       }
       else if(operador.equals("-")){//Es la resta
           String reglaE = "E.nodo = new Nodo(-,E1.nodo,T.nodo)";
           reglasEjecutadas.add("p"+paso+" "+reglaE);
       }
       else if(operador.equals("*")){//Es la multplicacion
           String reglaE = "E.nodo = new Nodo(*,E1.nodo,T.nodo)";
           reglasEjecutadas.add("p"+paso+" "+reglaE);
       }
       else if(operador.equals("/")){//Es la division
           String reglaE = "E.nodo = new Nodo(/,E1.nodo,T.nodo)";
           reglasEjecutadas.add("p"+paso+" "+reglaE);
       }
       
       //System.out.println("Inserando <Nodo dato>  ->"+operador);
       //System.out.println("Insertando <Nodo Derecho>  -> "+derecho.getDato());
       //System.out.println("Insertando <Nodo Izquierdo>  -> "+izquierdo.getDato());
   }
   public String regresaValex(String lexema){
   return "";
   }
   
   public void agregarProducciones(){
   }//agregarProducciones
   
   public String getTablaProducciones(){
   return "";
   }// getTablaProducciones
   
   public void agregaRelgasS(String lexema,String valor){
   
   }// agregar reglas semanticas
   
   public String getReglasS(){
   return "";
   }//getReglasS
   
   public void setReglas(){}
   public String getReglasEjecutadas(){
       return reglasEjecutadas+"";
   }
   public void insertaSimbolos(String NombreDatos){
   }
   public Nodo crear(String expresion){
       StringTokenizer tokenizer;
       String token;
       //1. Crear el token
       tokenizer = new StringTokenizer(expresion,espacios+aritmeticos,true);
       //2. Recorrer la expresion mientras existan tokens
       
       while (tokenizer.hasMoreElements()) {
           token = tokenizer.nextToken();
           //System.out.println("token --> "+token);
           if(espacios.indexOf(token) <=0 && 
                   aritmeticos.indexOf(token)<0){
               //System.out.println("No es espacio ni operador aritmetico");
               reglasEjecutadas.add("T.nodo = new Hoja ( id<"+token+">, id.entrada_"+token);
               ArbolNodo.push(new Nodo(token));
           }else if(token.equals(")")){
               while (!caracter.empty()
                       && !caracter.peek().equals("(")) {
                   //System.out.println("Insertar en la pila");
                   guardar();   
               }// while
               caracter.pop();
           }// if- espacios -aritmeticos
           else{
               if (!token.equals("(") &&  !caracter.empty()) {//Pila caracter no esta vacia y tampoco es "("
                   String exa = (String) caracter.peek();
                   //System.out.println("Peek de la pila: "+exa);
                   while (!exa.equals("(") &&  caracter.empty() && 
                           aritmeticos.indexOf(exa)>= aritmeticos.indexOf(token)) {  // No es "("                     
                       guardar(); //Guardar Nodo
                       if (!caracter.empty()) {
                           exa = (String) caracter.peek();
                       }// if !caracter.emptyC
                   }//while exa
               }//if token
               reglasEjecutadas.add("E.nodo = new Nodo ( aritmetico <"+token+">, id.entrada_"+token);
               caracter.push(token);
           }
       }//while
       //** VACIADO FINAL **//
       while (!caracter.empty()) {           
           if (caracter.peek().equals("(")) {
               caracter.pop();
           }else{
           //System.out.println("Insertando los operadores");
           guardar();//AQUI SE INSERTAN LOS OPERADORES
           raiz = (Nodo) ArbolNodo.peek();
           }//if
       }//while caracter empty    
       
       return raiz;
   }//metodo crear
   
    
}
