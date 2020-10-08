package cse360assignment02;

public class AddingMachine {
  private int total;
  private String tot = "";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () { 
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  tot = tot + " + " + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  tot = tot + " - " + value;
  }

  public String toString () {
    return "0" + tot;
  }

  public void clear() {
	  total = 0;
	  tot = "";
  }
}
