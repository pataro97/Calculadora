/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;



/**
 *
 * @author pablo
 */

public class Calculadora {
static double ans = 0;
    /**
     * @param args the command line arguments
     */

     
    
    //Metodo Suma
    public static double suma(double datoSum1, double datoSum2) {
        ans = datoSum1 + datoSum2;
        return ans;
    }
    //Meto resta
    public static double resta(double datoRes1, double datoRes2) {
        ans = datoRes1 - datoRes2;
        return ans;
    }
    //Metodo Multiplica
    public static double multiplica(double datoMultiplica1, double datoMultiplica2) {
        ans = datoMultiplica1 * datoMultiplica2;
        return ans;
    }
    //Metodo Divide
    public static double divide(double datoDivide1, double datoDivide2) {
        ans = datoDivide1 / datoDivide2;
        return ans;
    }
    
    //Metodo Suma1
    public static double suma1(double datoSum1) {
        ans = datoSum1 + ans;
        return ans;
    }
    //Meto resta1
    public static double resta1(double datoRes1) {
        ans = datoRes1 - ans;
        return ans;
    }
    //Metodo Multiplica1
    public static double multiplica1(double datoMultiplica1) {
        ans = datoMultiplica1 * ans;
        return ans;
    }
    //Metodo Divide1
    public static double divide1(double datoDivide1) {
        ans = datoDivide1 / ans;
        return ans;
    }
    public static void main(String[] args) {
        // Realiza la operacion y lo muestra en pantalla
        System.out.println(multiplica(4,4));
    }
    
}
