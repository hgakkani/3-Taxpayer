
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
  private static final double luxTaxRate = 1.09;
  private static final double NecssTaxRate = 1.01;
  
  private double cost;
  private Boolean isLuxury;
  
    
  public Item() {
    cost = 0;
    isLuxury = false;
  }
  
  public void setCost(double inputCost) {
    
    cost = inputCost;
  }
  
    
  public void setIsLuxury(Boolean inputIsLuxury) {
    
    isLuxury = inputIsLuxury;
  }

  
  public double calculateCostAfterTax() {
    
    if (this.isLuxury) {
      if (this.cost * luxTaxRate >= Double.MAX_VALUE) {
        return Double.MAX_VALUE;
      }
      return this.roundToPennies((this.cost * luxTaxRate));
    }
    
    if (this.cost * NecssTaxRate >= Double.MAX_VALUE) {
      return Double.MAX_VALUE;
    }
    return this.roundToPennies(this.cost * NecssTaxRate);
  }

  
  public double roundToPennies(double input) {
    
    BigDecimal value = new BigDecimal(input);
    return value.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
  }

}
