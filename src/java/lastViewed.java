
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class lastViewed {
   
    ArrayList<Products> fiveProducts = new ArrayList<Products>();
    int size = 0;
    public  void add(Products p){
        if(fiveProducts.size() == 5)
        {
            fiveProducts.remove(0);
            fiveProducts.add(p);
            
        }
        else
        {
            fiveProducts.add(p);
            ++size;
        }
    }
}
   