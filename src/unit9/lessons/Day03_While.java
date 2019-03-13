package unit9.lessons;

import java.util.Scanner;

public class Day03_While {
  
  public static void main (String [] args){

    Scanner in = new Scanner(System.in);
      
    System.out.println("Enter some numbers.");

    double total = 0;
    int count = 0;
    
    double n = Double.parseDouble(in.nextLine());
    
      while (n != 0) {
      
          total += n;
          count ++;
          
          n = Double.parseDouble(in.nextLine());
    }
    
     System.out.printf("Average: %.2f", total / count);
  
  }

}
