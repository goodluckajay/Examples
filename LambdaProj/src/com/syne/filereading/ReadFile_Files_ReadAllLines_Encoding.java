package com.syne.filereading;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadFile_Files_ReadAllLines_Encoding {
  public static void main(String [] pArgs) throws IOException {
	  String fileName = "c:\\ContainerOfTestingFiles\\sample-10KB.txt";
    File file = new File(fileName);

    //use UTF-8 encoding
    List<String>  fileLinesList = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);

    for(String line : fileLinesList) {
      System.out.println(line);
    }
  }
}