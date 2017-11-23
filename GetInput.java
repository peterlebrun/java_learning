import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInput {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter String");
    String s = br.readLine();
    System.out.print("Enter Integer:");

    try {
      int i = Integer.parseInt(br.readLine());
      System.out.print("\n");
      System.out.print("You entered: ");
      System.out.print(i);
    } catch (NumberFormatException nfe) {
      System.err.println("Invalid Format!");
    }
  }
}
