public class Chips{
  private double cost;
  private String size;
  private String flavor;

  //no argument constructor
  public Chips(){
    cost = 0.0;
    size = "small";
    flavor = "original";
  }

  //parameterized constructor
  public Chips(double cost, String size, String flavor){
    this.cost = cost;
    this.size = size;
    this.flavor = flavor;
  }


  //get methods
  public double getCost(){
    return cost;
  }
  
  
  public String getSize(){
    return size;
  }
  public String getFlavor(){
    return flavor;
  }


  //mutator methods
  public void setCost(double cost){
    if(cost < 0){
      this.cost = 0;
    }
    else{
      this.cost = cost;
    }
  }

  
  public void setSize(String size){
    this.size = size;
  }

  public void setFlavor(String flavor){
    this.flavor = flavor;
  }


  //toString method. Not called for chips
  public String toString(){
    return "cost: " + cost + "\nsize: " + size + "\nflavor: " + flavor;
  }
}