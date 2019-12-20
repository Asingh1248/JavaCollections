/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectsMapCallTO;
import java.util.*;
/**
 *
 * @author animesh
 */
public class HashMapDictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<String,String>(); //Creating the object of the MAp Interface using HashMap class
        m.put("Animesh","9820951248");
        m.put("Abhishek","123456789"); //This one Entry
        m.put("Abhinay","2587913675");
        
//        String value=m.get("Animesh");
//        System.out.println("Phone No of the :"+value);
        
        //Iterating I need all the key's or the Whole Entry Set
        
//        Set st=m.keySet();
//        System.out.println(st);
        
//        for(Map.Entry m1:m.entrySet()) //Entry sub Interface of the Map
//        {
//            System.out.println(m1.getKey()+" "+m1.getValue());
//        }
        
        m.replace("Abhinay","8425877339");
        for(Map.Entry hm:m.entrySet()){
            System.out.println(hm.getKey()+" "+hm.getValue());
        }
        
        // TODO code application logic here
    }
    
}
