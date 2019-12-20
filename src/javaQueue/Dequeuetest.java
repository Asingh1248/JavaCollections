/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaQueue;
//DoubleEndedQueue

import java.util.*;

/**
 *
 * @author animesh
 */
public class Dequeuetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//  Error:Deque <String> deque=new Deque<String>();
        Queue<String> q1 = new ArrayDeque<String>();
        //Double Ended Queue Remove and Insert From Both Ends

        //ArrayDeque ---implemenst Dequeue Interface
        //Faster than ArrayList anf Stack and has no capacity Restriction
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
//Traversing elements  
        for (String str : deque) {
            System.out.println(str);
        }

    }

}
