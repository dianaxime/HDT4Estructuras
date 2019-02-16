/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt2;
/*Integrantes:
Diana Ximena de Leon Figueroa 18607
Fatima Jazmin Albeño Barrios 18060

Miercoles 13 de febrero de 2019

//Implementacion de Calculadora usando Singleton 

/**
 *
 * @author DIANA
 */
public class MyCalculator implements Calculator {
    
    private static MyCalculator instance;
    
    public static MyCalculator getInstance(){
        if (instance==null){
            instance = new MyCalculator();
        }
        return instance;
    }
    
    @Override
    public int calculate (int num1, int num2, String op){
        //recibe dos numeros y un operador 
        //dependiendo del operador asi sera la operacion que realice
        // en resta y division se intercambian los operandos por el orden de las operaciones 
        int resultado;
        resultado = 0;
        switch (op){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num2 - num1;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num2 / num1;
                break;
        }
        return resultado;
    }
    
}
