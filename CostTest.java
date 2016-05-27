import java.io.*;
import java.util.*; 
import java.util.Arrays.*; 


public class CostTest
  {
  public static void main(String args[])
    {  
    
    double cost = Double.parseDouble(args[0]);  
    boolean isLuxury = Boolean.parseBoolean(args[1]);
    
    Item test = new Item();
    test.setCost( cost);
    test.setIsLuxury( isLuxury);
    double totalCost = test.calculateCostAfterTax();
    System.out.println(totalCost);
  }
}
  