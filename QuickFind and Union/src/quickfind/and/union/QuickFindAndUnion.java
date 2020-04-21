/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickfind.and.union;
import java.io.IOException;
import static java.lang.System.in;
import static java.time.Clock.system;
import java.util.Scanner;
import quickfind.and.union.QuickFindUF;
import QuickUnion.QuickUnion;
/**
 *
 * @author muhammad faraz ansar
 */
public class QuickFindAndUnion {    
    public static void main(String[] args) throws IOException {
         Scanner in = new Scanner(System.in); 
        QuickFindUF obj = new QuickFindUF(10);
        int p = in.nextInt(); 
        int q = in.nextInt(); 
        boolean result = obj.isconnected(p, q);
        
        if(result == true)
        {
            System.out.println("The Entered Pair is Already Connected");
        }
        else
        {
            obj.Union(p, q);
            System.out.println("The Entered Pair is Now Connected");
        }
        // quick Union
     QuickUnion obj1 = new QuickUnion(10)   ;
     int p1 = in.nextInt(); 
     int q1 = in.nextInt(); 
     boolean result1 = obj1.isconnected(p1, q1);
      if(result1 == true)
        {
            System.out.println("The Entered Pair is Already Connected");
        }
        else
        {
            obj1.union(p1, q1);
            System.out.println("The Entered Pair is Now Connected");
        }
     // for improving the Algorithm just add one step in Root function i-e id[i] = id[id[i]];
     //which directly connect the smaller tree to the larger tree
    }    
}
