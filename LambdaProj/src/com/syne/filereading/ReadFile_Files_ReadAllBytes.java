package com.syne.filereading;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFile_Files_ReadAllBytes {
  public static void main(String [] pArgs) throws IOException {
	  String fileName = "c:\\ContainerOfTestingFiles\\installAgent.log";
    File file = new File(fileName);

    byte [] fileBytes = Files.readAllBytes(file.toPath());
    char singleChar;
    for(byte b : fileBytes) {
      singleChar = (char) b;
      System.out.print(singleChar);
    }
  }
}