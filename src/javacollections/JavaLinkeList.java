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
public class JavaLinkeList {
    
    public static void main(String[] args) {
//      LinkedList <String> al=new LinkedList<String>();
      List al=new LinkedList();
      al.add("Ravi");  //Object is add and Boolean
      boolean add = al.add("Vijay"); //Manipluation is Fast No Shifting is Required
      al.add("Ravi"); //Not Synchronized
      al.add("Ajay");
      al.add(2.2);
      
      //Returns Iteraor over the elemenst of type T
      Iterator  itr=al.iterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
    }
   
  
    
}
