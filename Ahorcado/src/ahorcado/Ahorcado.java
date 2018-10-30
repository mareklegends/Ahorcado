package ahorcado;

import java.util.Scanner;

/**
 *
 * @author MarekLegends
 */

public class Ahorcado {
   
       
    //te pide que digas la palabra. para el contador de intentos
    public static boolean gameOVER(String[] vector){
        boolean fin = false;
        
        for (int i = 0; i < vector.length; i++) {
      
            
        }
        
        
        return fin;
    }
    
    //poner mi palabra en el vector
    
  public static void inicializarVectores(String[] vector, String[] v2, String palabra){
        
        for (int i = 0; i < vector.length; i++) {
   
            vector[i]=palabra.substring(i, i+1);
            v2[i]=" _ ";
         
        }   
    }
  
    //comprobar la letra que escribas con la palabra
    
    public static void comprobarVectorpalabra(String[] vector, String letra){
        
        //como mando al un vector que esta en una funcion y una variavle que esta en otra funcion
        
    }    
    
    public static void pintaMuñeco(int vidas){
        switch(vidas){
         
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
    
    
    public static void main(String[] args) {
     
    //varibales principales
    int empezarjuego,vidas=6;
    String palabra = "hola";

    //inicializar el vector de la palabra  
    String[] vPalabra = new String[palabra.length()];
     String[] vSacar = new String[palabra.length()];
    inicializarVectores(vPalabra,vSacar,palabra);

    
        
    //bucle de inicio de juego    
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
    
    //poner la bandera en true
                  
    boolean bandera=true;
  
        
    //bucle para cuando ya le has dado a jugar para que te salga cuando falles
        do{
            pintaMuñeco(vidas);
            //pinto vsacar
            //leo palabra
            //compruebo si ha terminado
            
        
        }while(bandera=false);
        
        
    //el juego ya ha terminado aquí
        
        
    }
    
}
