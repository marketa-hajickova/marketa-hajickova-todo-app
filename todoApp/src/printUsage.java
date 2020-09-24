import java.util.Arrays;

public class printUsage {

  public static void main(String[] args) {

    System.out.println("Command Line Todo Application");
    System.out.println("==============================");

    //System.out.println(Arrays.toString(args));
    if (args.length == 0) {
      System.out.println("Command line arguments:");
      System.out.print("-l Lists all the tasks".indent(3));
      System.out.print("-a Adds a new task".indent(3));
      System.out.print("-r Removes an task".indent(3));
      System.out.print("-c Completes an task".indent(3));
      return;
    }
    switch (args[0]) {
      case "-l":
        System.out.println("Lists all the tasks");
        break;
      case "-a":
        System.out.println("Adds a new task");
        break;
      case "-r":
        System.out.println("Removes an task");
        break;
      case "-c":
        System.out.println("Completes an task");
        break;
      default:
        System.out.println("Not valid command!");
        break;
    }
  }
}
