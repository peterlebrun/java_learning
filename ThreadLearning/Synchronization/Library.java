class Library extends Thread {
  Output output;

  public Library(Output output) {
    this.output = output;
  }

  public void run() {
    output.print("Library Print.");
  }
}
