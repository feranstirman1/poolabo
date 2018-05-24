/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.Fabricas;

import calculadora.Aritmetico.Suma;
import calculadora.Aritmetico.Resta;
import calculadora.Aritmetico.MUltiplicacion;
import calculadora.Aritmetico.Division;
import calculadora.Aritmetico.Operaciones;
import calculadora.Conversor.Conversor;

/**
 *
 * @author uca
 */
public class OperacionFactory implements AbstractFactory {
    @Override
    public Operaciones getOperacion(String op){
        Operaciones operacion;
        switch(op){
            case "suma":
               operacion= new Suma();
               return operacion;
            case "resta":
                operacion= new Resta();
                return operacion;
            case "multiplicacion":
                operacion=new MUltiplicacion();
                return operacion;
            case "division":
                operacion=new Division();
                return operacion;
        }
    }
 
    @Override
    public Conversor getConversion(String conv){
        return null;
    }
}
