/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack.implementation.with.limked.list;

/**
 *
 * @author muhammad faraz ansar
 */
public class StackImplementationWithLimkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StackLinkedList obj = new StackLinkedList();
        
        obj.Push(2);
        obj.Push(3);
        obj.Display();
        
        obj.Pop();
        System.out.print("\n");
        obj.Display();
    }
    
}
