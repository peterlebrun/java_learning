public class Main {
  public static void main(String[] args) {
    Output output = new Output();
    Library library = new Library(output);
    University university = new University(output);
    library.start();
    university.start();
  }
}
