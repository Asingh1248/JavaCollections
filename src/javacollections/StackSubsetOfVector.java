/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;
import java.util.*;

public class StackSubsetOfVector {

    
    public static void main(String[] args) {
//      Stack  stack=new Stack();
//      stack.push("Ayush");
//      stack.push(2.5);
//      Iterator itr=stack.iterator();
//  Its Not Good Practice Because (We Should Declare DataType that we are putting)
    
        Stack <String> stack=new Stack();
        stack.push("Animesh");
//        stack.add(2.2) Learn Genrics vs Collection Better to get the Error at Complie Time Instead RunTime
         stack.add("Abhijeet");
         stack.push("Garima");
         System.out.println("Before Pop");
         System.out.println(stack);
         stack.pop();
         System.out.println("After Pop");
         System.out.println(stack);
         String testpeek=stack.peek();
         System.out.println("Peek of the Stack :" +testpeek);
         
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
              
    }
    
}
