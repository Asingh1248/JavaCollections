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
class Book1
{
   int id;
   String Author,Bookname;

    public Book1(int id, String Author, String Bookname) {
        this.id = id;
        this.Author = Author;
        this.Bookname = Bookname;
    }
   
   
 
}

public class HashMapObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Book1 b1=new Book1(101,"Amish","Shiva Triology");
        Book1 b2=new Book1(102,"Dan Brown", "Da vinci Code");
        Book1 b3=new Book1(103,"Chetan Bhagat","Revolution 2020");
        Map<Integer,Book1> m=new HashMap<Integer,Book1>();
        m.put(1,b1);
        m.put(2, b2);
        m.put(3,b3);
        
        for(Map.Entry<Integer,Book1> hm:m.entrySet())  //To Traverse through Convert to Set or Entrya
        {
            int key=hm.getKey();
            Book1 printBook1=hm.getValue();
            System.out.println("Key Details "+key);
            System.out.println(printBook1.id+" "+printBook1.Bookname+" "+printBook1.Author);
            
        }
        
       
            
        
    }
    
}
