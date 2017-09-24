package file;
import java.io.*;
public class FileStreamDemo {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ReadFromFile.txt");
         out = new FileOutputStream("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/WriteToFile.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}