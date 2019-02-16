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

//Clase Abstracta que implementa algunos metodos de List

/**
 *
 * @author DIANA
 * @param <E>
 */
public abstract class AList<E> implements List<E> {
     public AList()
   // post: does nothing
   {
   }

     @Override
   public boolean isEmpty()
   // post: returns true iff list has no elements
   {
      return size() == 0;
   }
  
   /*  @Override
  public boolean contains(E value)
  // pre: value is not null
  // post: returns true iff list contains an object equal to value
  {
	return -1 != indexOf(value);
  }*/
}
