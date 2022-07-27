package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
    	ArrayList<String> foods = new ArrayList<String>();
        //    Don't forget to import the ArrayList class
         
        // 2. Add five Strings to your list
        foods.add("pizza");
        foods.add("banana");
        foods.add("pasta");
        foods.add("cheese");
        foods.add("pepper");
        // 3. Print all the Strings using a standard for-loop
              for(int i = 0; i < foods.size(); i++) {
            	 String f = foods.get(i); 
            	 System.out.println("String at element" + " " + i  + " " + f);
              }
        // 4. Print all the Strings using a for-each loop
              for(String f : foods) {
            	  System.out.println(f);
              }
        // 5. Print only the even numbered elements in the list.
              for(int i = 0; i < foods.size(); i+=2) {
             	 String f = foods.get(i); 
             	 System.out.println("String at element" + " " + i  + " " + f);
               }
        // 6. Print all the Strings in reverse order.
              for(int i = 4; i >= 0; i--) {
             	 String f = foods.get(i); 
             	 System.out.println("String at element" + " " + i  + " " + f);
        // 7. Print only the Strings that have the letter 'e' in them.
        
    }
}
}
