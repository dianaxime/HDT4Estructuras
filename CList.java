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

//Circular List
/**
 *
 * @author DIANA
 * @param <E>
 */
public class CList<E> extends AList<E> {
    protected Node<E> tail; 
    protected int count;

    public CList()
    // pre: constructs a new circular list
    {
       tail = null;
       count = 0;
    }

    @Override
    public void addFirst(E value)
    // pre: value non-null
    // post: adds element to head of list
    {
       Node<E> temp = new Node<>(value);
       if (tail == null) { // first value added
           tail = temp;
           tail.setNext(tail);
       } else { // element exists in list
           temp.setNext(tail.next());
           tail.setNext(temp);
       }
       count++;
    }


    @Override
    public void addLast(E value)
    // pre: value non-null
    // post: adds element to tail of list
    {
       // new entry:
       addFirst(value);
       tail = tail.next();
    }


    // lo dificil es quitar el elemento de la cola

    public E removeLast()
    // pre: !isEmpty()
    // post: returns and removes value from tail of list
    {
       Node<E> finger = tail;
       while (finger.next() != tail) {
           finger = finger.next();
       }
       // finger now points to second-to-last value
       Node<E> temp = tail;
       if (finger == tail)
       {
           tail = null;
       } else {
           finger.setNext(tail.next());
           tail = finger;
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
        Node<E> temp = tail;
        return temp.value();
    }

    @Override
    public E removeFirst() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
