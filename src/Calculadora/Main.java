
package Calculadora;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        byte opcion =0; 
        
        //Menú principal
        do{
            System.out.println("\n\tMenú Principal"
            +"\n1) Aritmética"
            +"\n2) Trigonometría"
            +"\n3) Estadística"
            +"\n4) Cálculo"
            +"\n5) Salir");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextByte();
            System.out.println();
            
            switch (opcion){
                case 1: 
                    Aritmetica menuAritmetica = new Aritmetica();
                    menuAritmetica.Menu();
                    break;
                case 2: 
                    Trigonometria menuTrigonometria = new Trigonometria();
                    menuTrigonometria.Menu();
                    break;
                case 3: 
                    Estadistica menuEstadistica = new Estadistica();
                    menuEstadistica.Menu();
                    break;
                case 4: 
                    Calculo menuCalculo = new Calculo();
                    menuCalculo.Menu();
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("La opción no existe, vueva a seleccionar");
                    break;
            }
        }while(opcion != 5);
    }
}
