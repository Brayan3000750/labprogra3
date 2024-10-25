
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Menu {
    public static void main(String[] args){
    
    Scanner datos=new Scanner(System.in);
    int opciones;
    
    System.out.println("\nMenú");
            System.out.println("1. Cadenas");
            System.out.println("2. Notas");
            System.out.println("3. Clases");
            System.out.println("4. Salir");
            System.out.println("Seleccione una de las opciónes: ");
            opciones = datos.nextInt();
            datos.nextLine();
    
    
    switch(opciones){
    
        case 1:
        System.out.println("Ingrese la cadena");
        String cadenas=datos.nextLine();
       
        int[] contar=new int[256];
        
        for(int x=0;x<cadenas.length();x++){
            contar[cadenas.charAt(x)]++;
        }
        
          char caracterMaximo = ' ';
                    int repeticionesMaximas = 0;

                    for (int i = 0; i < contar.length; i++) {
                        if (contar[i] > repeticionesMaximas) {
                            repeticionesMaximas = contar[i];
                            caracterMaximo = (char) i;
                        }
                    }
   System.out.println("El carácter con mas repeticiones es: " + caracterMaximo + " con " + repeticionesMaximas + " repeticiones.");
                    break;
                    
        case 2:
            int cantNotas;
            do{
            System.out.println("Ingrese la cantidad de notas que quiera");    
            cantNotas=datos.nextInt();
            if (cantNotas <= 0) {
               System.out.println("La cantidad debe ser positiva.");
            }
             
            }while (cantNotas <= 0);
                    
                 double suma = 0;
                    double maximoNota = 0;  
                    double minimoNota = 100;  

                    for (int j = 1; j <= cantNotas; j++) {
                        double nota;
                        do {
                            System.out.print("Nota #" + j + ": ");
                            nota = datos.nextDouble();
                            if (nota < 0 || nota > 100) {
                                System.out.println("La nota tiene que estar dentro de 0 a 100.");
                            }
                        } while (nota < 0 || nota > 100);
                    
                    suma+=nota;
                    
                    
                    
                    }
                    
                    }
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    }
    

        

    
    
    

    
    

