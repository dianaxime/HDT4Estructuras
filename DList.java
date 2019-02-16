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

//Doubly Linked List

import java.util.NoSuchElementException;

/**
 *
 * @author DIANA
 * @param <E>
 */
public class DList<E> extends AList<E> {
    protected int count;
    protected DNode<E> head;
    protected DNode<E> tail;

    public DList()
    // post: constructs an empty list
    {
       head = null;
       tail = null;
       count = 0;
    }


    @Override
    public void addFirst(E value)
    // pre: value is not null
    // post: adds element to head of list
    {
       // construct a new element, making it head
       head = new DNode<>(value, head, null);
       // fix tail, if necessary
       if (tail == null) tail = head;
       count++;
    }


    @Override
    public void addLast(E value)
    // pre: value is not null
    // post: adds new value to tail of list
    {
       // construct new element
       tail = new DNode<>(value, null, tail);
       // fix up head
       if (head == null) head = tail;
       count++;
    }


    public E removeLast()
    // pre: list is not empty
    // post: removes value from tail of list
    {
       DNode<E> temp = tail;
       tail = tail.previous();
       if (tail == null) {
           head = null;
       } else {
           tail.setNext(null);
       }
       count--;
       return temp.value();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public E getFirst() {
        DNode<E> tmp;
        tmp = head;
        return tmp.value();
    }

    @Override
    public E removeFirst() {
        if (size() == 0) throw new NoSuchElementException();
        DNode<E> tmp;
        tmp = head;
        head = head.nextElement;
        head.previousElement = null;
        count--;
        return tmp.value();
    }
}
