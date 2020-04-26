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
public class StackLinkedList {
    //Node
    private class Node{
        int data;
        Node next;
    }
    Node First; //variable of StackLinkedList class
    //constructor to initialize the node
    public StackLinkedList(){
        this.First = null;
    }
    //inserting at stack
    public void Push(int x){
        //initialize a temp node
        Node Temp = new Node();
        //assign data x to temp node
        Temp.data = x;
        // insert at top of stack
        Temp.next = First;
                
        First = Temp;//First Node = Temp Node
    }
    //deleting node
    public void Pop()
    {
        //pop the last entered element because last in first out
        
        if(First==null)
        {
            System.out.println("The stack is empty..nothing can pop");
        }
        First =First.next; //now first to point next
    }
    //check if empty
    public Boolean IsEmpty()
    {
        return First == null;
        
    }
    
    public int Top()
    {
        if(IsEmpty())
        {
            System.out.println("The stack is empty");
            return -1;
        }
        else 
        {
            return First.data;
        }
    }
    
    public void Display()
    {
         if(IsEmpty())
        {
            System.out.println("The stack is empty");
        }
         else{
             Node temp = First;
             while(temp!=null)
             {
                 System.out.printf("%d->",temp.data);
                 temp = temp.next;
             }
         }
    }
}
