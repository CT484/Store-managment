public class Lays extends Chips{
  private boolean isCurly;

  //no argument constructor
  public Lays(){
    super(0.0,"small","original");
    isCurly = false;
  }

  //parameterized constructor
  public Lays(double cost, String size, String flavor, boolean isCurly){
    super(cost,size,flavor);
    this.isCurly = isCurly;
  }

  //get method
  public boolean getIsCurly(){
    return isCurly;
  }

  //mutator method
  public void setIsCurly(boolean isCurly){
    this.isCurly = isCurly;
  }

  //to string method including chips' to string
  public String toString(){
    return super.toString()+ "\nIs Curly: " + isCurly;
  }
}