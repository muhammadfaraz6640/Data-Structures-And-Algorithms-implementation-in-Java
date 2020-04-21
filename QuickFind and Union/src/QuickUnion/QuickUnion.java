/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuickUnion;

/**
 *
 * @author muhammad faraz ansar
 */
public class QuickUnion {
     public int[] id;
    public QuickUnion(int n) //assign id to each number
    {
        id = new int[n];
        for(int i=0;i<n;i++)
        {
            id[i] = i;
        }
    }
    public int Root(int i)
    {
        while(i != id[i])
        {
            i = id[i];
        }
        return i;
    }
    
    public boolean isconnected(int p, int q)
    {
        return Root(p) == Root(q);
    }
    public void union(int p, int q)
    {
    int i = Root(p);
    int j = Root(q);
    id[i] = j;
    }
}
