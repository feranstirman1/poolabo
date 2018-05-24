/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.Fabricas;
import calculadora.Conversor.Binario;
import calculadora.Conversor.Conversor;
import calculadora.Aritmetico.Operaciones;


/**
 *
 * @author uca
 */
public class ConversorFactory implements AbstractFactory{
    @Override
    public Conversor getConversion(String conv){
        Binario binario= new Binario();
        return binario;
    }
    
    @Override
    public Operaciones getOperacion(String op){
        return null;
    }
}
