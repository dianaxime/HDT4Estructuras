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
public class FactoryList<E> {
    public List<E> getList(String list){
        switch (list) {
            case "SINGLY":
                return new SingleList<>();
            case "DOUBLY":
                return new DList<>();
            case "CIRCULAR":
                return new CList<>();
            default:
                break;
        }
        return null;
    }
}
