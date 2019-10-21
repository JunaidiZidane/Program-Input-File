/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP ProBook
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class percobaan_bacafile {

 public static void main(String[] args) {
  BufferedReader objReader = null;
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("D:\\yes.txt"));

   while ((strCurrentLine = objReader.readLine()) != null) {

    System.out.println(strCurrentLine);
   }

  } catch (IOException e) {

   e.printStackTrace();

  } finally {

   try {
    if (objReader != null)
     objReader.close();
   } catch (IOException ex) {
    ex.printStackTrace();
   }
  }
 }
}