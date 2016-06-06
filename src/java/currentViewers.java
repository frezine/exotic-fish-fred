import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heleneblouin
 */
public class currentViewers {
    HashMap<Integer,Integer> pageViewers;

    public currentViewers() {
        pageViewers = new HashMap<>();
    }
  
    
    public void add(){
     for(Integer i = 1; i < 13 ; i++){
        pageViewers.put(i,0);
     }
    }
    public int getViewers(int i){
        return pageViewers.get(i);
    }
    
    public void increase(int i){
        pageViewers.put(i,pageViewers.get(i)+1);
    }
     
    public void decrease(int i){
        pageViewers.put(i,pageViewers.get(i)-1);
    }
   // pageViewers.put(1,0);    
   // pageViewers.put(1,0);
    
    
   
}
   // d.put(1 ,0);
    
    

