/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muhammad faraz ansar
 */
public class QuickFind {
    public int[] id;
    public QuickFind(int n) //assign id to each number
    {
        id = new int[n];
        for(int i=0;i<n;i++)
        {
            id[i] = i;
        }
    }
    public boolean isconnected(int a,int b){  //check if a and b are connected
        boolean res;
        if(id[a]==id[b])
        {
            res = true;
        }
        else
        {
            res=false;
        }
        return res;
    }
    
    //if not connected then connect by bellow function
    public void Union(int a , int b)
    {
        int aid=id[a];
        int bid=id[b];
        
        for (int i = 0; i < id.length; i++)
             if (id[i] == aid) id[i] = bid;

        
    }
}
