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

    
       
    //para el contador de intentos
    public static int gameOVER(){
        int intentos;
        intentos = 7;
        
        return intentos;
    }
    
   
    
    
    public static void main(String[] args) {
        
    
         System.out.println("[=====================]");
        System.out.println("|                     |");
        System.out.println("|     AhorcadoGAME    |");
        System.out.println("|                     |");
        System.out.println("|     1 [Empezar]     |"); 
        System.out.println("|                     |");
        System.out.println("[=====================]");
        System.out.println("");
        
        int empezarjuego;
        Scanner leer = new Scanner(System.in);
        empezarjuego = leer.nextInt();
        
        if(empezarjuego==1){
            
            // sacarPalabra();
            
            System.out.println("[=====================]");
            System.out.println("");                    
            //mostrar el vector de la palabra
            System.out.println("");
            System.out.println("Dime un palabra");
            String letra;
            Scanner leer2 = new Scanner(System.in);
            letra = leer.next();
            System.out.println("[=====================]");
        }
        
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
        
        
    }
    
}
