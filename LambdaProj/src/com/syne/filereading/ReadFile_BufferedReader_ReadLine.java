package com.syne.filereading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_BufferedReader_ReadLine {
  public static void main(String [] args) throws IOException {
	  String fileName = "c:\\ContainerOfTestingFiles\\sample-10KB.txt";
    FileReader fileReader = new FileReader(fileName);
   
    try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      String line;
      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    }
  }
}