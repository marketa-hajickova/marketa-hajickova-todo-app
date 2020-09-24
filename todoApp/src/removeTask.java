import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class removeTask {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No given argument!");
      return;
    }
    switch (args[0]) {
      case "-r":
        Path path = Paths.get("src/data/tasks.txt");
        try {
          List<String> lines = Files.readAllLines(path);
          if (lines.size()>=2) {
            if (args.length<2) {
              System.out.println("Unable to remove: no index provided");
            } else if (!isInteger(args[1])){
              System.out.println("Unable to remove: index is not a number");
            } else if (Integer.parseInt(args[1]) >= lines.size()) {
              System.out.println("Unable to remove: index is out of bound");
            } else {
              Files.readAllLines(path).clear();
              lines.remove(args[1]);
              System.out.println("Task " + args[1] + " have been removed");


              Files.write(path, lines);
              for (String line : lines) {
                System.out.println(line);
              }
            }
          } else {
            System.out.println("Not enough tasks!");
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      default:
        System.out.println("Not valid argument!");
        break;
    }
  }

  public static boolean isInteger(String input) {
    try{
      Integer.parseInt(input);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
