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

//Stack utilizando las Lists
/**
 *
 * @author DIANA
 * @param <E>
 */
public class MyList<E> implements Stack<E> {
   protected List<E> data;

	public MyList(String milista)
	// post: constructs a new, empty stack
	{
            FactoryList nuevalist = new FactoryList();
		data = nuevalist.getList(milista);
	}

    @Override
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.addLast(item);
	}

    @Override
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.removeLast();
	}

    @Override
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
            E a;
            a=pop();
            push(a);
            return a;
	}
	
    @Override
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
    @Override
        public boolean empty(){
            //retorna true/false dependiendo si esta vacio
            return size()==0;
        } 
}
