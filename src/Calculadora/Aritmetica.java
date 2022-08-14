
package Calculadora;

import java.util.Scanner;


public class Aritmetica {
    
    //Método Menú
    public void Menu (){
        Scanner entrada = new Scanner(System.in);
        
        double num1,num2;
        byte opcion = 0;
        
        OperacionAritmetica op = new OperacionAritmetica();
        
        do{
            System.out.println("\n\tMenú Aritmética"
            +"\n1) Sumar"
            +"\n2) Resta"
            +"\n3) Multiplicacion"
            +"\n4) División"
            +"\n5) Regresar al menú principal");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextByte();
            System.out.println();
            
            switch (opcion){
                case 1: 
                    System.out.print("Ingrese numero 1: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Ingrese numero 2: ");
                    num2 = entrada.nextDouble();
                    System.out.println("\nLa suma de "+num1+" + "+num2+" es: "+op.Suma(num1, num2));
                    break;
                case 2: 
                    System.out.print("Ingrese numero 1: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Ingrese numero 2: ");
                    num2 = entrada.nextDouble();
                    System.out.println("\nLa resta de "+num1+" - "+num2+" es: "+op.Resta(num1, num2));
                    break;
                case 3: 
                    System.out.print("Ingrese numero 1: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Ingrese numero 2: ");
                    num2 = entrada.nextDouble();
                    System.out.println("\nLa multiplicación de "+num1+" * "+num2+" es: "+op.Producto(num1, num2));
                    break;
                case 4: 
                    System.out.print("Ingrese el dividendo: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Ingrese el divisor: ");
                    num2 = entrada.nextDouble();
                    op.division(num1, num2);
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("La opción no existe, vueva a seleccionar");
                    break;
            }
        }while(opcion!=5);
    }
}
