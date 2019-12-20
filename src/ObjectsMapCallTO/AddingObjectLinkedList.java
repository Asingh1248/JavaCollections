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

class Book
{
 int id;
 String name,author,publisher;
 int quantity;
 public Book(int id,String name,String author,String publisher,int quantity){
     this.id=id;
     this.name=name;
     this.author=author;
     this.publisher=publisher;
     this.quantity=quantity;
     
     
 }
 
}
public class AddingObjectLinkedList {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        //Creating the Linked List of the Book
        LinkedList<Book>list=new LinkedList<Book>();
        
        //Creating Books
        Book b1=new Book(1,"DaVinciCode","Forget","MacMillan",10);
        Book b2=new Book(2,"Shiva Trilogy","Amish Tripathi","Penguin", 20);
        
        //Adding Book to List
        list.add(b1);
        list.add(b2);
        
        //Traversing in Reverse Order
//        Iterator<Book> itr=list.descendingIterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
          
        for(Book b:list){
            
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
            
        }
        
        list.remove(b1);
        System.out.println(list);
    }
    
}
