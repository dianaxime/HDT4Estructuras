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

//Nodos para Doubly Linked List

/**
 *
 * @author DIANA
 * @param <E>
 */
public class DNode<E> {
    protected E data;
    protected DNode<E> nextElement;
    protected DNode<E> previousElement;

public DNode(E v, DNode<E> next, DNode<E> previous)
{
    data = v;
    nextElement = next;
    if (nextElement != null)
        nextElement.previousElement = this;
    previousElement = previous;
    if (previousElement != null)
        previousElement.nextElement = this;
}

public DNode(E v)
// post: constructs a single element
{
    this(v,null,null);
} 

public DNode<E> previous(){
    return previousElement;
}

public void setNext(DNode<E> siguiente){
    this.nextElement = siguiente;
}
public E value(){
    E valor= null;
    if (data!=null){
        valor=data;
    }
   return valor;
}

}


