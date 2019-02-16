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
public class FactoryStack<E> {
    public Stack<E> getStack(String stack, String list){
        switch (stack) {
            case "VECTOR":
                return new MyStack<>();
            case "ARRAY":
                return new MyArray<>();
            case "LIST":
                return new MyList<>(list);
            default:
                break;
        }
        return null;
    }
    public Stack<E> getStack(String stack){
        switch (stack) {
            case "VECTOR":
                return new MyStack<>();
            case "ARRAY":
                return new MyArray<>();
            /*case "LIST":
                return new MyList<>(list);*/
            default:
                break;
        }
        return null;
    }
}
