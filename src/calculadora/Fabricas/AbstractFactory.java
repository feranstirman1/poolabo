/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.Fabricas;

import calculadora.Conversor.Conversor;
import calculadora.Aritmetico.Operaciones;

/**
 *
 * @author uca
 */
public interface AbstractFactory {
    Operaciones getOperacion(String op);
    Conversor getConversion(String conv);
}
