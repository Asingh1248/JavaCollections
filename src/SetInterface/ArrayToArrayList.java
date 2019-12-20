/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetInterface;
import  java.util.*;
/**
 *
 * @author animesh
 */
public class ArrayToArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n=sc.nextInt();
        String [] name=new String[n];
        System.out.println("Enter the name");
        for(int i=0;i<=n;i++){
            name[i]=sc.nextLine();
        }
        
        
        List<String> l=Arrays.asList(name); //Imp
        System.out.println();
        
        for(String str:l){
            System.out.println(str);
        }
        
    }
    
}
