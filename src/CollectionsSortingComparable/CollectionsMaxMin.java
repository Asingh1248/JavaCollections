/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsSortingComparable;
import java.util.*;
import java.lang.*;


/**
 *
 * @author animesh
 *//**
 *
 * @author animesh
 *//**
 *
 * @author animesh
 */
public class CollectionsMaxMin {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        List <Integer> l=new ArrayList<Integer>();
        l.add(101);
        l.add(508);
        l.add(502);
        l.add(400);
        
        //Normal Sort
        Collections.sort(l);
        System.out.println("Normal sorting "+l);
        
        System.out.println("Custom Sorting");
        Comparator<Integer> com=new CompImp();
        Collections.sort(l,com); //Anonymous Class --new Keyword(without Object)
        System.out.println("Custom Sorted "+l);
        //Sort As Per the Last Digit of the Number (400,101,502,508)
        
    }

    private static class CompImp implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1%10>o2%10){
              return 1;
            }
            return -1;
        }

      
    }
    
}
