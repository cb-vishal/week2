import java.io.*;
import java.lang.*;
import java.util.*;
public class CsvDuplicate{
  public static void main(String args[])throws Exception {
    BufferedReader br1 = null;
     File getFile1 = new File("File1.csv");
       
     File outputFile=new File("Output.csv");
    try {
      if (getFile1.exists() && getFile1.isFile()) {

       FileReader readerFile1 = new FileReader(getFile1);
       
        br1 = new BufferedReader(readerFile1);
       
        String line;
       FileWriter out = new FileWriter(outputFile);
       Set str1 = new LinkedHashSet();
       
    
     while((line = br1.readLine()) != null)
     {
     
        str1.add(line);
     }

      Iterator itr = str1.iterator();
        while(itr.hasNext())
        {
           
           out.write(itr.next()+"\n");
        }
       
       
       out.close();
         
       }
    }
  catch(IOException e){
  System.err.println("Problem:"+e);
}
}
}
