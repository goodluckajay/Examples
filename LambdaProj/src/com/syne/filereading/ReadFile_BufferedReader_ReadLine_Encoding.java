package com.syne.filereading;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile_BufferedReader_ReadLine_Encoding {
  public static void main(String [] args) throws IOException {
	  String fileName = "c:\\ContainerOfTestingFiles\\sample-10KB.txt";

    FileInputStream fileInputStream = new FileInputStream(fileName);
   
    //specify UTF-8 encoding explicitly
    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
   
    try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
      String line;
      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    }
  }
}