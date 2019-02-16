/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt2;

/**
 *
 * @author DIANA
 * @param <E>
 */
public class SingleList<E> extends AList<E>{
   protected int count; // list size
   protected Node<E> head; // ref. to first element

   public SingleList()
   // post: generates an empty list
   {
      head = null;
      count = 0;
   }
   
   @Override
   public int size()
   // post: returns number of elements in list
  {
    return count;
  }
  
   @Override
  public void addFirst(E value)
  // post: value is added to beginning of list
  {
     // note order that things happen:
     // head is parameter, then assigned
     head = new Node<>(value, head);
     count++;
  }
  
   @Override
  public E removeFirst()
  // pre: list is not empty
  // post: removes and returns value from beginning of list
 {
     Node<E> temp = head;
     head = head.next(); // move head down list
     count--;
     return temp.value();
  }
  @Override
  public E removeLast()
  // pre: list is not empty
  // post: removes and returns value from end of list
 { 
      // pointer to possible tail
         Node<E> finger = head;
         Node<E> previous= null;
      if (head != null)
     {
         
         while (finger.next() != null)
         {
             previous=finger;
                finger = finger.next();
         }    
      } 
      if (previous==null){
          head=null;
      }
      else{
          previous.setNext(null);
      } 
	  count--;
	return finger.value();  
  }
  
   @Override
  public E getFirst()
  // pre: list is not empty
  // post: returns first value in list
  {
      return head.value();
  }
  
   @Override
  public void addLast(E value)
  // post: adds value to end of list
  {
      // location for new value
      Node<E> temp = new Node<>(value,null);
      if (head != null)
     {
         // pointer to possible tail
         Node<E> finger = head;
         while (finger.next() != null)
         {
                finger = finger.next();
         }
		 
         finger.setNext(temp);
      } else head = temp;
	  
	  count++;
	  
   }
   
   
   /*@Override
   public boolean contains(E value)
   // pre: value is not null
   // post: returns true iff value is found in list
  {
      Node<E> finger = head;
	  
      while (finger != null &&
             !finger.value().equals(value))
     {
          finger = finger.next();
      }
      return finger != null;
   } */
}
