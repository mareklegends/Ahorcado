package ahorcado;

import java.util.Scanner;

/**
 *
 * @author MarekLegends
 */

public class Ahorcado {
   
       

    
    //poner mi palabra en el vector
    
  public static void inicializarVectores(String[] vector, String[] v2, String palabra){
        
        for (int i = 0; i < vector.length; i++) {
   
            vector[i]=palabra.substring(i, i+1);
            v2[i]=" _ ";
         
        }   
    }
  
    public static void mostarVectores(String[] v2){

     
        
             for (int i = 0; i < v2.length; i++) {
   
       
            System.out.print(v2[i]);
         
        } 
            System.out.println("");    

    }
    
    
    public static void comprobarPalabra(String[] vector,String[] v2,String p,String pwin,int vidas){

     boolean bandera=true;
        
        for (int i = 0; i < vector.length; i++) {
           if(vector[i].equals(pwin)){
               v2[i]=pwin;
               bandera=true;
               break;
      
           }
           else{
              vidas--; 
              bandera=true;
           break;
 
           }
        }
       
    
    }
    
    public static boolean gameOVER(int vidas){
            boolean bandera=true;
            
               if(vidas==0){
            bandera=false;
        }
               
                     
        return bandera;
    }
    

    
    public static void pintaMuñeco(int vidas){
        switch(vidas){
         
            case 5:
                System.out.println("|");
                System.out.println("|");
                System.out.println("____");       
        
                System.out.println("");

                break;                
                
            case 4:
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("____"); 
                
                System.out.println("");

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
    
                 
   
                break;
            
        } 
    }
    
    
    public static void main(String[] args) {
     
    //varibales principales
    int empezarjuego,vidas=6;
    String palabra = "hola";
    String sacarpalabra;
    
        
    //poner la bandera en true
                  
    boolean bandera=true;
  
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

        
    //bucle para cuando ya le has dado a jugar para que te salga cuando falles
        do{
            
            //dibujo
            pintaMuñeco(vidas);
            
            System.out.println("Adivina la palabra");
            System.out.println("================");
            
            //muestro el vector adivinado o no
            mostarVectores(vSacar);
        
            System.out.println("================");
            //leo palabra
            System.out.println("Dime una letra");
            Scanner leer8 = new Scanner(System.in);
            sacarpalabra = leer8.nextLine();
            System.out.println("================");
            
            //compruebo si ha terminado
            comprobarPalabra(vPalabra,vSacar,palabra,sacarpalabra,vidas);
     
            
                gameOVER(vidas);
        
        }while(bandera=false);
        
        

        
         
    }
    
}
