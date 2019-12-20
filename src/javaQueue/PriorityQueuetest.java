/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaQueue;
//Maintains the FIFO--Hold the Elems=ent which are about to be processed

import java.util.*;

/**
 *
 * @author animesh
 */
public class PriorityQueuetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  Hold the Elements or Objects which are processed by thier priority

        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit Sharma");
        queue.add("Vijay Raj");
        queue.add("Raj");
        System.out.println("head :" + queue.peek());
        Iterator itr = queue.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
      
        String removed = queue.remove();
        System.out.println("Removed wala :" + removed);
        Iterator itr2 = queue.iterator();

        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
//        String removed2 = queue.poll();
//        
//        System.out.println("Removed wala :" + removed2);
    }

}
