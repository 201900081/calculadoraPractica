
package Calculadora;

public class OperacionTrigonometria {
    //Seno del angulo
    public double Seno(double num1, double num2) {
        double seno, potencia, factorial, signo;
        seno = 0;
        for (int i = 0; i <= num2; i++) {
            potencia = Math.pow(num1, (2 * i + 1));
            signo = Math.pow(-1, i);
            factorial = 1;
            for (int j = 1; j <= (2 * i + 1); j++) {
                factorial = factorial * j;
            }
            seno = seno + (signo * potencia / factorial);
        }
        return seno;
    }
    //Coseno del angulo
    public double Coseno(double num1, double num2) {
        double coseno, potencia, factorial, signo;
        coseno = 0;
        for (int i = 0; i <= num2; i++) {
            potencia = Math.pow(num1, (2 * i ));
            signo = Math.pow(-1, i);
            factorial = 1;
            for (int j = 1; j <= (2 * i); j++) {
                factorial = factorial * j;
            }
            coseno = coseno + (signo * potencia / factorial);
        }
        return coseno;
    }
    //Tangente del angulo
    public double Tangente (double num1, double num2){
        double tangente =0;
        OperacionTrigonometria op = new OperacionTrigonometria();
        tangente =op.Seno(num1, num2)/op.Coseno(num1, num2);
        return tangente;
    }
}
