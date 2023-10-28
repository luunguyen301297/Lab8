package Lab8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/25/2023, Wednesday
 **/
public class CreateAndWriteToFiles {
  public void createAndWriteToFiles() {
    try {
      File newFile = new File("C:\\Users\\ad\\Desktop\\Students.txt");
      if (newFile.createNewFile()) {
        System.out.println("File was created with path : C:\\Users\\ad\\Desktop\\" + newFile.getName());
        writeToFile();
      } else {
        System.err.println("File already exists ! Do you want to write data to file ? (Y/N) : ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equalsIgnoreCase("y")) {
          writeToFile();
        } else {
          System.out.println("Exit the program !");
        }
      }
    } catch (IOException e) {
      System.err.println(e.getMessage() + " / An error occurred");
    }
  }

  public void writeToFile() {
    try {
      FileWriter myWriter = new FileWriter("C:\\Users\\ad\\Desktop\\Students.txt");
//      for (int i = 0; i < studentList.size(); i++) {
//        myWriter.write(studentList.get(i).toString());
//      }
      myWriter.close();
      System.out.println("Successfully wrote to the file !");
    } catch (IOException e) {
      System.err.println(e.getMessage() + " / An error occurred !");
    }
  }
}
