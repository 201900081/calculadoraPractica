
package Calculadora;

import java.util.Scanner;

public class Estadistica {
    
    //Método Menú
    public void Menu (){
        Scanner entrada = new Scanner(System.in);
        String cadena;
        OperacionEstadistica op = new OperacionEstadistica();
        byte opcion = 0;
        do{
            System.out.println("\n\tMenú Estadística"
            +"\n1) Media"
            +"\n2) Varianza"
            +"\n3) Desviación estandar"
            +"\n4) Regresar al menú principal");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextByte();
            System.out.println();
            
            switch (opcion){
                case 1:                   
                    System.out.print("Ingrese la cadena de valores separados por comas: \n");
                    cadena = entrada.next();
                    System.out.println("\nLa media de { "+cadena+" } es: "+op.media(cadena));
                    break;
                case 2: 
                    System.out.print("Ingrese la cadena de valores separados por comas: \n");
                    cadena = entrada.next();
                    System.out.println("\nLa varianza de { "+cadena+" } es: "+op.varianza(cadena));
                    break;
                case 3: 
                    System.out.print("Ingrese la cadena de valores separados por comas: \n");
                    cadena = entrada.next();
                    System.out.println("\nLa desciación estandar de { "+cadena+" } es: "+Math.sqrt(op.varianza(cadena)));
                    break;
                case 4: 
                    break;
                default:
                    System.out.println("La opción no existe, vueva a seleccionar");
                    break;
            }
        }while(opcion!=4);
    }
}
