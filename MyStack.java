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

//Stack utilizando Vector
/**
 *
 * @author DIANA
 */
import java.util.*;

/**
 *
 * @author DIANA
 * @param <E>
 */
public class MyStack<E> implements Stack<E> {
    
    /**
     *
     */
    protected Vector<E> mivector;
    
    /**
     *
     */
    public MyStack(){
    
        //Crea un vector tamaño 10 y cuando alcance el maximo le suma 2 
    mivector = new Vector<>(10,2);
    
    }
    
    /**
     *
     * @param item
     */
    @Override
    public void push(E item){
        //añade un elemento
        mivector.addElement(item); 
    }
   
    /**
     *
     * @return
     */
    @Override
   public E pop(){
       //returna y elimina el ultimo elemento
       return mivector.remove(mivector.size()-1);
   }
   
    /**
     *
     * @return
     */
    @Override
   public E peek(){
       //retorna el ultimo valor 
       return mivector.get(mivector.size()-1);
   }
   
    /**
     *
     * @return
     */
    @Override
   public boolean empty(){
       //retorna true/false dependiendo si esta vacio
       return size()==0;
   }
   
    /**
     *
     * @return
     */
    @Override
   public int size(){
       //retorna el tamaño del vector
       return mivector.size();
   }  
}
