public class ChildClass extends BaseClass {
  /**
   *
   */
  protected int ANumber = 2;

  /**
   *
   */
  public void SayNumber() {
    System.out.println(ANumber);
  }

  /**
   *
   */
  public static void main(String[] args) {
    ChildClass cc = new ChildClass();
    cc.SaySomething();
    cc.SayNumber();
  }
}
