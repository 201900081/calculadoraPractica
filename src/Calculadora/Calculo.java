
package Calculadora;

import java.util.Scanner;


public class Calculo {
    
    //Método Menú
    public void Menu (){
        Gauss op = new Gauss();
        int n;
        String cadena="";
        Scanner entrada = new Scanner(System.in);
        byte opcion = 0;
        do{
            System.out.println("\n\tMenú Calculo"
            +"\n1) Resolver sistemas de ecuaciones de N*N con Gauss-Jordan"
            +"\n2) Regresar al menú principal");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextByte();
            System.out.println();
            
            switch (opcion){
                case 1: 
                    System.out.print("Ingrese el tamaño del sistema de ecuaciones: ");
                    n = entrada.nextInt();
                    if (n>0){
                        op.llenarMatriz(n);
                    }
                    else{
                        System.out.println("El tamaño del sistema debe ser un número positivo");
                    }
                    break;
                case 2: 
                    break;
                default:
                    System.out.println("La opción no existe, vueva a seleccionar");
                    break;
            }
        }while(opcion!=2);
    }
}

