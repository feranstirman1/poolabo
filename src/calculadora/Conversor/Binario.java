/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.Conversor;

/**
 *
 * @author uca
 */
public class Binario implements Conversor{
    @Override
    public double Convertir(int num){
        int exp=0;
        double binario=0;
        int digito;
        while(num!=0){
                digito = num % 2;           
                binario = binario + digito * Math.pow(10, exp);  
                exp++;
                num = num/2;
        }
        return binario;
    }
}
