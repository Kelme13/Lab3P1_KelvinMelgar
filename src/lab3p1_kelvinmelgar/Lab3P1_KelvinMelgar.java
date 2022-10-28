
package lab3p1_kelvinmelgar;

import java.util.Scanner;

public class Lab3P1_KelvinMelgar {
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Laboratorio #3\n");
        int usuario = 0;
        
        do{
            System.out.println("1. Diptongo.");
            System.out.println("2. Sumatorio PI");
            System.out.println("3. Time Clock");
            System.out.println("4. Salir...");
            System.out.print("Ingrese una opcion: ");
            
            usuario = sc.nextInt();
            
            switch(usuario){
                case 1:{
                    String palabra;
                    int paso;
                    
                    do{
                        paso = 1;
                        System.out.print("\nIngrese una palabra: ");
                        palabra = sc.next().toLowerCase();
                        
                        for (int i = 0; i < palabra.length(); i++) {
                            
                            if (paso == 1){
                                switch(palabra.charAt(i)){
                                    case 'a','b','c','d','e','f','g','h','i','j','k','l',
                                            'm','n','o','p','q','r','s','t','u','w','x',
                                            'y','z' -> {
                                        paso = 1;
                                        break;
                                    }//Si solo tiene letras..
                                    default -> {
                                        paso = 0;
                                    }//Si tiene algo mas..
                                }
                            }else break;//Termina el ciclo for si tiene algo mas
                        }
                        
                    }while(paso == 0);
                    //Revisa si la palabra solo tiene letras desde la 'a' a la 'z'
                    
                    int a = 0, b = 0;
                    for (int i = 0; i < palabra.length(); i++) {
                        
                        if (a == 0){
                            switch(palabra.charAt(i)){
                                   case 'a', 'e', 'i', 'o', 'u' -> a = 1; 
                            }
                        }
                        else if(b == 0){
                            switch(palabra.charAt(i)){
                                case 'a', 'e', 'i', 'o', 'u' -> b = 1; 
                                
                                default -> {
                                    a = 0;
                                }
                            }
                        }//Fin del if
                    }//Fin del for
                    
                    if (a == 1 && b == 1){
                        System.out.printf("%nResultado: %s es  un diptongo%n%n", palabra);
                    }else{
                        System.out.printf("%nResultado: %s no es diptongo...%n%n", palabra);
                    }
                    break;
                }//Fin del caso 1
                
                case 2:{
                    int limit = 0;
                    
                    while(limit <= 0){
                        System.out.print("Ingrese el limite: ");
                        limit = sc.nextInt();
                    }//Verifica si es mayor a cero
                    
                    double suma = 0, pi = 0;//Inicia las variables
                    
                    for (int i = 0; i < limit; i++) {
                        suma = suma + (Math.pow(-1, i)) / (2*i + 1);
                    }
                    
                    pi = suma * 4;
                    
                    System.out.println("Resultado: " + pi + "\n");
                    
                    break;
                }//Fin del caso 2
                
                case 3:{
                    int n_usuario = 2;
                    
                    while (n_usuario % 2 == 0){
                        System.out.print("Ingrese un numero impar: ");
                        n_usuario = sc.nextInt();
                    }
                    
                    int aster = n_usuario;
                    int esp = 0;
                    for (int i = 0; i < n_usuario; i++) {
                        
                        for (int j = 0; j < i && i <= n_usuario / 2; j++) {
                            System.out.print("  ");
                        }
                        
                        for (int k = 0; k < n_usuario - (i*2); k++) {
                            System.out.print("* ");
                        }
                        
                        if (i > (n_usuario / 2)){
                            for (int j = 0; j < n_usuario - (i+1); j++) {
                                System.out.print("  ");
                            }

                            for (int j = 0; j < ((i+1) * 2) - n_usuario; j++) {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    
                    System.out.println();
                    break;
                }//Fin del caso 3
                
                case 4:{
                    System.out.println("\n\nSaliendo...");
                    break;
                }//FIn del caso 4
                
                default:{
                    
                    System.out.println("\n\nOpcion invalida...");
                    break;
                }
            }
        }while(usuario != 4);
    }
    
}
