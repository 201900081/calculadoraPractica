package Calculadora;

import java.util.Scanner;

public class Gauss {

    //Metodos
    public void llenarMatriz(int n) {
        Scanner entrada = new Scanner(System.in);
        double matriz[][] = new double[n][];//Define el número de filas

        //Llenado de matriz
        System.out.println("Ingrese los coeficientes separados por una coma");
        for (int i = 0; i < matriz.length; i++) {
            //Ingreso de datos como una cadena
            System.out.print("f" + i + ": ");
            String cadena = entrada.nextLine();
            String valores[] = cadena.split(",");
            //Se define el número de columnas
            matriz[i] = new double[valores.length]; //El número de columnas depende del tamaño de la cadena ingresada.

            //Llenado de la matriz
            for (int j = 0; j < valores.length; j++) {
                matriz[i][j] = Integer.valueOf(valores[j]);
            }
        }
        System.out.println("\n\tLa matriz aumentada es: ");
        //Mostrar la matriz aumentada
        for (int i = 0; i < n; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("|");
            System.out.println("");
        }
        Gauss llamar = new Gauss();
        llamar.matrizCalculo(matriz);

    }

    public void matrizCalculo(double llenarMatriz[][]) {
        double matrizAux[][] = llenarMatriz;
        double divisor;
        System.out.println();

        for (int i = 0; i < matrizAux.length; i++) {
            divisor = matrizAux[i][i];

            //fila pivote
            for (int j = 0; j < matrizAux[0].length; j++) {
                matrizAux[i][j] = matrizAux[i][j] / divisor;
            }

            //Mostrar la matriz en pantalla
            System.out.println("procedimiento: f" + i + "/" + divisor);
            System.out.println("--------------------------");
            for (int m = 0; m < matrizAux.length; m++) {
                System.out.print("|");
                for (int n = 0; n < matrizAux[m].length; n++) {
                    System.out.print(matrizAux[m][n] + " ");
                }
                System.out.print("|");
                System.out.println("");
            }
            System.out.println("--------------------------");
            //Finaliza impresión en pantalla

            //Eliminar columnas
            if (i < matrizAux.length - 1) {
                //filas para calcular
                for (int j = i + 1; j < matrizAux.length; j++) {
                    //columna para calcular
                    divisor = matrizAux[j][i];
                    for (int k = 0; k < matrizAux[0].length; k++) {
                        matrizAux[j][k] = (matrizAux[j][k] - (divisor * matrizAux[i][k]));
                    }
                    //Mostrar la matriz en pantalla
                    System.out.println("procedimiento:" + " f" + j + " - " + divisor + " * f" + i);
                    System.out.println("--------------------------");
                    for (int m = 0; m < matrizAux.length; m++) {
                        System.out.print("|");
                        for (int n = 0; n < matrizAux[m].length; n++) {
                            System.out.print(matrizAux[m][n] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.println("--------------------------");
                    //Finaliza impresión en pantalla
                }
            }
        }

        for (int i = matrizAux.length - 1; i >= 1; i--) {
            //Filas
            for (int j = i - 1; j >= 0; j--) {
                //Eliminar columnas
                divisor = matrizAux[j][i];
                //Recorrido de columnas
                for (int k = matrizAux[0].length - 1; k >= 0; k--) {
                    matrizAux[j][k] = (matrizAux[j][k] - (divisor * matrizAux[i][k]));
                }

                //Mostrar la matriz en pantalla
                System.out.println("procedimiento:" + " f" + j + " - " + divisor + " * f" + i);
                System.out.println("--------------------------");
                for (int m = 0; m < matrizAux.length; m++) {
                    System.out.print("|");
                    for (int n = 0; n < matrizAux[m].length; n++) {
                        System.out.print(matrizAux[m][n] + " ");
                    }
                    System.out.print("|");
                    System.out.println("");
                }
                System.out.println("--------------------------");
                //Finaliza impresión en pantalla

            }
        }
        //Mostrar la matriz en pantalla
        System.out.println("Respuesta: ");
        System.out.println("--------------------------");
        for (int m = 0; m < matrizAux.length; m++) {
            System.out.print("|");
            for (int n = 0; n < matrizAux[m].length; n++) {
                System.out.print(matrizAux[m][n] + " ");
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.println("--------------------------");
        //Finaliza impresión en pantalla
    }
}
