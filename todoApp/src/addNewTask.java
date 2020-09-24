import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class addNewTask {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Unable to add: no task provided or no valid argument");
      return;
    }
    switch (args[0]) {
      case "-a":
        Path path = Paths.get("src/data/tasks.txt");
        try {
          List<String> lines = Files.readAllLines(path);
          lines.add(args[1]);

          Files.write(path, lines);
        } catch (IOException e) {
          e.printStackTrace();
        }
        break;
      default:
        System.out.println("Not valid argument!");
        break;
    }
  }
}
