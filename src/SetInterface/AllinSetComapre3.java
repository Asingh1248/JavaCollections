/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetInterface;
//Abhi tak ---Ordered list
import  java.util.*;

/**
 *
 * @author animesh
 */
public class AllinSetComapre3 {
//  Unorder Set of Elements --Duplicate Values are not store,At MOst one null value
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Set<String> s1 = new HashSet<String>();  
    Set<String> s2 = new LinkedHashSet<String>();  
    Set<String> s3 = new TreeSet<String>();  
    
//   Hash Table and Hashing is Used Only Unique Value
    s1.add("Ravi");
    s1.add("Vijay");
//V.imp(Duplicate not allowed)s1.add("Ravi");
    s1.add(null);
//V.imp Only one null allowed s1.add(null);
    for(String str:s1){
        System.out.println(str);
    }
        System.out.println("\n************LinkedHashSet-----");
//************LinkedHashSet--(Maintains Inser O)**************       
    s2.add("Ani");
    s2.add("Abhi");
    s2.add(null);
    s2.add(null);
    for(String str:s2){
        System.out.println(str);
    }
    
    
    //*************(Tree Set  )*******************;
// the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.
    
   System.out.println("\n************TreeSet-----");
    s3.add("Ravi"); //Alphabetic Order
    s3.add("Vijay");
    s3.add("Ravi");
    s3.add("Ajay");
    
    for(String str:s3){
        System.out.println(str);
    }
    }
    
}
