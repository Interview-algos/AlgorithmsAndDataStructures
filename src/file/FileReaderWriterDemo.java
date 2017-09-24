package file;
import java.io.*;
public class FileReaderWriterDemo {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/ReadFromFile.txt");
         out = new FileWriter("/my-mac/work/eclipse-workspace/algorithms/Algorithms/resources/WriteToFile.txt");
         
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