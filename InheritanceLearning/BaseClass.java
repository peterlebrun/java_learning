public class BaseClass {
  /**
   * An int of some sort
   */
  protected int ANumber = 0;

  /**
   * A string of some sort
   */
  protected String AString = "foobar";

  /**
   * Standard constructor
   */
  public BaseClass() {}

  /**
   *
   */
  public void SaySomething() {
    System.out.println(AString);
  }

  public static void main(String[] args) {
    BaseClass bc = new BaseClass();
    bc.SaySomething();
  }
}
