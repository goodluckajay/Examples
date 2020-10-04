package com.syne.filereading;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_FileReader_Read 
{
  public static void main(String [] pArgs) throws IOException 
  {
    String fileName = "c:\\ContainerOfTestingFiles\\sample-10KB.txt";
    try (FileReader fileReader = new FileReader(fileName)) 
    {
      int singleCharInt;
      char singleChar;
      while((singleCharInt = fileReader.read()) != -1) {
        singleChar = (char) singleCharInt;
       
        //display one character at a time
        System.out.print(singleChar);
      }
    }
  }
}