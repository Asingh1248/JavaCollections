/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacollections;
import java.util.*;

/**
 *
 * @author animesh
 */
public class JavaCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Uses Dynamic Array
        ArrayList<String>list=new ArrayList<String>();//Creating ArrayList
        list.add("Ravi"); //Maintains Insertion Order 
        list.add("Vijay");
        list.add("Ravi"); //duplicate Values
        list.add("Ajay");
        
     //Travrsing list through  Iertaor
     Iterator itr=list.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
     }
        
    }
    
}
