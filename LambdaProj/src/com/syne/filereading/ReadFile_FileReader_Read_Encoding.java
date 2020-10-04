package com.syne.filereading;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile_FileReader_Read_Encoding {
  public static void main(String [] pArgs) throws IOException {
	  String fileName = "c:\\ContainerOfTestingFiles\\sample-10KB.txt";
    FileInputStream fileInputStream = new FileInputStream(fileName);
   
    //specify UTF-8 encoding explicitly
    try (InputStreamReader inputStreamReader =
      new InputStreamReader(fileInputStream, "UTF-8")) {

      int singleCharInt;
      char singleChar;
      while((singleCharInt = inputStreamReader.read()) != -1) {
        singleChar = (char) singleCharInt;
        System.out.print(singleChar); //display one character at a time
      }
    }
  }
}