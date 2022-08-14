
package Calculadora;


public class OperacionEstadistica {
    //Atributos
    private double media;
    private double varianza;


    //Métodos
    public double media (String cadena) {
        double suma = 0;
        String valores [] = cadena.split(","); //(Split) fragmenta la cadena cada vez que encuentre una coma.
        int datos [] = new int [valores.length];
                
        for (int i=0; i<valores.length;i++){
            datos [i]=Integer.valueOf(valores [i]);//Integer.valueOf(parametro) convierte un String a un entero.
            suma += datos [i];
        }
        media = suma/datos.length;
        return media;
    }
    
    
    public double varianza (String cadena) {
        OperacionEstadistica promedio = new OperacionEstadistica();
        double prom = promedio.media(cadena);
        double suma = 0;
        double base = 0;
        String valores [] = cadena.split(","); //(Split) fragmenta la cadena cada vez que encuentre una coma.
        int datos [] = new int [valores.length];
                
        for (int i=0; i<valores.length;i++){
            datos [i]=Integer.valueOf(valores [i]);//Integer.valueOf(parametro) convierte un String a un entero.
            base = Math.pow((datos[i]-prom), 2);
            suma += base;
        }
        varianza = suma/datos.length;
        return varianza;
    }
}
