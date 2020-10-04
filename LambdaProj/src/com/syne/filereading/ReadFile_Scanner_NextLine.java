package com.syne.filereading;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile_Scanner_NextLine {
  public static void main(String [] pArgs) throws FileNotFoundException {
	  String fileName = "c:\\ContainerOfTestingFiles\\sample-10KB.txt";
    File file = new File(fileName);
   
    try (Scanner scanner = new Scanner(file)) {
      String line;
      boolean hasNextLine = false;
      while(hasNextLine = scanner.hasNextLine()) {
        line = scanner.nextLine();
        System.out.println(line);
      }
    }
  }
}