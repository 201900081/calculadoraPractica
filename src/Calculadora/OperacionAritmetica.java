
package Calculadora;


public class OperacionAritmetica {
    //Atributos
    private double suma;
    private double resta;
    private double producto;
    private double division;

    //Métodos
    public double Suma(double num1,double num2) {
        suma = num1+num2;
        return suma;
    }
    public double Resta(double num1,double num2) {
        resta = num1-num2;
        return resta;
    }
    public double Producto(double num1,double num2) {
        producto = num1*num2;
        return producto;
    }
    
    public void  division(double num1,double num2) {
        if (num2 !=0){
            division = num1/num2;
            System.out.println("\nLa división de "+num1+" / "+num2+" es: "+division);
        }else{
            System.out.println("No se puede realizar divisiones entre cero.");
        }
    }     
}
