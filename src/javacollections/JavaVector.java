/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacollections;
import  java.util.*;
/**
 *
 * @author animesh
 */
public class JavaVector {
    public static void main(String[] args) {
        List  v=new Vector();
        v.add("Ayush");
        v.add(2);
        v.add(2.2);
        //Uses Dynamic Array to Store the Data elemenst and Similar ArraylList
        //Its Synchronized
//        New Way of Implementation
//    V.imp    System.out.println(v);
        Iterator itr=v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
    
}
