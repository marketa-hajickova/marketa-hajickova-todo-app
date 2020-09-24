import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class listTasks {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No given argument!");
      return;
    }
    switch (args[0]) {
      case "-l":
        Path path = Paths.get("src/data/tasks.txt");
        try {
          List<String> lines = Files.readAllLines(path);
          int count = 0;
          for (String line : lines) {
            count++;
            System.out.println(count + " - " + line);
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
}
