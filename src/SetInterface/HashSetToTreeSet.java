/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetInterface;

/**
 *
 * @author animesh
 */

import  java.util.*;
public class HashSetToTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set <String> m=new HashSet<String>();
        m.add("Sharda");
        m.add("Abhishek");
        m.add("Guddu");
        m.add("Abhijeet");
        
        System.out.println("HashSet "+m);
        Set<String> s1=new TreeSet<>(m);
        System.out.println("TreeSet "+s1);
        
    }
    
}
