/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author MarekLegends
 */
public class Ahorcado {

    
       
    //te pide que digas la palabra. para el contador de intentos
    public static int gameOVER(){
   
        int intentos;
        intentos=7;
            
        System.out.println("[=====================]");
        System.out.println("");                    
        //mostrar el vector de la palabra
        System.out.println("");
        System.out.println("Dime una letra");
        String letra;
        Scanner leer2 = new Scanner(System.in);
        letra = leer2.next();
        System.out.println("[=====================]");               
        
 

        return intentos;
    }
    
    //poner mi palabra en el vector
    
  public static void inicializarVectorpalabra(String[] vector){
        
        String palabra;
        
        palabra="marcos";
               
        for (int i = 0; i < vector.length; i++) {
   
            vector[i]=palabra.substring(i, palabra.length()-1);
         
        }
        
     
        
    }
  
  //poner el vector de sacar palabra con guiones
  
    public static void inicializarVectorsacar(String[] vector){
       
                  
        for (int i = 0; i < vector.length; i++) {
   
            vector[i]="-";
         
        }
        
    }
    //comprobar la letra que escribas con la palabra
    
    public static void comprobarVectorpalabra(String[] vector, String letra){
        
        //como mando al un vector que esta en una funcion y una variavle que esta en otra funcion
        
    }
      
    
    
    public static void main(String[] args) {
     
        //varibales principales
        int empezarjuego;
          
        //inicializar el vector de la palabra  
        String[] vPalabra = new String[6];
        inicializarVectorpalabra(vPalabra);
        
        //inicializar el vector de la palabra a adivinar 
        String[] vSacar = new String[6];
        inicializarVectorsacar(vSacar);
        
    do{
    
        
        System.out.println("[=====================]");
        System.out.println("|                     |");
        System.out.println("|     AhorcadoGAME    |");
        System.out.println("|                     |");
        System.out.println("|     1 [Empezar]     |"); 
        System.out.println("|                     |");
        System.out.println("[=====================]");
        System.out.println("");
        
      
        Scanner leer = new Scanner(System.in);
        empezarjuego = leer.nextInt();
        
        
        }while(empezarjuego!=1);
    
      
                  
        boolean bandera;
        bandera=true;

    
        do{
        switch(gameOVER()){
         
            case 5:
                System.out.println("|");
                System.out.println("|");
                System.out.println("____");       
        
                System.out.println("");
                System.out.println("================");
                System.out.println("");                    
                System.out.println("- - - - - -");
                System.out.println("");
                System.out.println("================");
                System.out.println("");
                System.out.println("No has fallao");
                System.out.println("");
                System.out.println("Intentos que te quedan: ");
                break;
                
                
            case 4:
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("____"); 
                
                System.out.println("");
                System.out.println("================");
                System.out.println("");                    
                System.out.println("- - - - - -");
                System.out.println("");
                System.out.println("================");
                System.out.println("");
                System.out.println("No has fallao");
                System.out.println("");
                System.out.println("Intentos que te quedan: ");
                break;
            case 3:
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("____"); 
                
                System.out.println("");
                System.out.println("================");
                System.out.println("");                    
                System.out.println("- - - - - -");
                System.out.println("");
                System.out.println("================");
                System.out.println("");
                System.out.println("No has fallao");
                System.out.println("");
                System.out.println("Intentos que te quedan: ");
                break;
                
                
            case 2:
                
                System.out.println("_________ ");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|    [ o.0 ]");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("____");
                
                System.out.println("");
                System.out.println("================");
                System.out.println("");                    
                System.out.println("- - - - - -");
                System.out.println("");
                System.out.println("================");
                System.out.println("");
                System.out.println("No has fallao");
                System.out.println("");
                System.out.println("Intentos que te quedan: ");
            
                break;
            case 1:
                System.out.println("_________ ");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|    [ o.0 ]");
                System.out.println("|       |");
                System.out.println("|      -|-/");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("____");
                
                System.out.println("");
                System.out.println("================");
                System.out.println("");                    
                System.out.println("- - - - - -");
                System.out.println("");
                System.out.println("================");
                System.out.println("");
                System.out.println("No has fallao");
                System.out.println("");
                System.out.println("Intentos que te quedan: ");
                
                break;
                
                
            case 0:
                
                System.out.println("_________ ");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|    [ o.0 ]");
                System.out.println("|       |");
                System.out.println("|      -|-/");
                System.out.println("|       |");
                System.out.println("|      ____");
                System.out.println("|");
                System.out.println("|");
                System.out.println("____");
                
                System.out.println("");
                System.out.println("================");
                 
                System.out.println("Willy murio, te quedaste sin intentos");
                System.out.println("");
                System.out.println("La palabra era: ");
                
                break;
            
        } 
        }while(bandera=false);
     
        
        
    }
    
}
