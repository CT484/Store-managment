import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
    double cost = 0;
    Lays lays = new Lays();
    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
    //prompts user for cost and saves value
    //System.out.println("Lays Cost?");
    //double cost = input.nextDouble();
    //lays.setCost(cost);
    
    //prompts user for size and saves value
    System.out.println("Lays Size?(small / medium / large)");
    String size = input.next();
    lays.setSize(size);
    if(size.equals("small")){
      cost = 4.99;
      lays.setCost(cost);
    }
    if(size.equals("medium")){
      cost = 5.99;
      lays.setCost(cost);
    }
    if(size.equals("large")){
      cost = 6.99;
      lays.setCost(cost);
    }
    //prompts user for flavor and saves value
    System.out.println("Lays Flavor?");
    String flavor = input.next();
    lays.setFlavor(flavor);

    //prompts user for isCurly and saves value
    System.out.println("Lays Is curly?(true/false)");
    boolean curly = input.nextBoolean();
    lays.setIsCurly(curly);
    if(curly == true){
      cost += 1;
      lays.setCost(cost);
    }
    //creates extra space
    System.out.println("\n");

    
    /** 
    To string method from Lays - extended from chips
    Prints out extra lines for design
    prints out informatiom
    **/
    System.out.println("---------Lays---------");
    System.out.println(lays);
    
    //In a nutshell prints out what determines the cost
    //Not much to know besides subtracting cost by 1 is to account for when chips are curly
    if(curly == true){
      if(size.equals("small")){
        cost -= 1;
        System.out.println("Size is " + size +". Adds " + "$" + cost + ". Chips are curly. Adds " + "$1");
      }
      if(size.equals("medium")){
        cost -=1;
        System.out.println("Size is " + size +". Adds " + "$" + cost + ". Chips are curly. Adds " + "$1");
      }
      if(size.equals("large")){
        cost -=1;
        System.out.println("Size is " + size +". Adds " + "$" + cost + ". Chips are curly. Adds " + "$1");
      }
    }
    //not subtracting cost by one here since we know chips aren't curly
    else{
      System.out.println("Size is " + size +". Adds " + "$" + cost);
    }
    System.out.println("----------------------");
    
    // Closes the Scanner object
    input.close();
    
  }
}