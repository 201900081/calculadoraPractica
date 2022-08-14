
package Calculadora;

import java.util.Scanner;


public class Trigonometria {
    
    //Método Menú
    public void Menu (){
        Scanner entrada = new Scanner(System.in);
        double num1,num2,angulo;
        byte opcion;
        
        OperacionTrigonometria op = new OperacionTrigonometria();
        do{
            System.out.println("\n\tMenú Trigonometría"
            +"\n1) Seno"
            +"\n2) Coseno"
            +"\n3) Tangente"
            +"\n4) Regresar al menú principal");
            System.out.print("Ingrese una opción: ");
            opcion = entrada.nextByte();
            System.out.println();
            
            switch (opcion){
                case 1: 
                    System.out.print("Ingrese el valor de x: ");
                    angulo = entrada.nextDouble();
                    num1 = angulo*Math.PI/180; // Convierte el ángulo a radianes
                    System.out.print("Ingrese el valor de i: ");
                    num2 = entrada.nextDouble();
                    if (num2>0){
                        System.out.println("\n->Seno ("+angulo+") = "+op.Seno(num1, num2));
                    }
                    
                    break;
                case 2: 
                    System.out.print("Ingrese el valor de x: ");
                    angulo = entrada.nextDouble();
                    num1 = angulo*Math.PI/180; // Convierte el ángulo a radianes
                    System.out.print("Ingrese el valor de i: ");
                    num2 = entrada.nextDouble();
                    if (num2>0){
                        System.out.println("\n->Coseno ("+angulo+") = "+op.Coseno(num1, num2));
                    }
                    
                    break;
                case 3: 
                    System.out.print("Ingrese el valor de x: ");
                    angulo = entrada.nextDouble();
                    num1 = angulo*Math.PI/180; // Convierte el ángulo a radianes
                    System.out.print("Ingrese el valor de i: ");
                    num2 = entrada.nextDouble();
                    if (num2>0){
                        System.out.println("\n->Tangente ("+angulo+") = "+op.Tangente(num1, num2));;
                    }
                    
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
