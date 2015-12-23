import java.io.*;
import java.util.*;
import com.opencsv.CSVWriter;
import com.opencsv.CSVReader;
class CsvRead{
  public static void main(String ar[])
   {

     
     StringJoiner sj;
     String[][] record=new String[][]{
        {"NAME","ADDRESS","MOBILE","HOME","WORK"},
        {"raju","chennai","7811020212","9985432134","9076542314"},
        {"ajit","chennai","7811020219","7685432134","8976542334"},
        {"vaibhav","chennai","8811020213","7685432134","8976542312"},
        {"vishal","chennai","9011020213","9085432134","5676542314"}};
      try{
     
      CSVWriter writer = new CSVWriter(new FileWriter("data.csv"));
        
      for(int i=0;i<5;i++)
       {
     
         writer.writeNext(record[i]);
       }
        
     
      writer.close();


      CSVReader reader = new CSVReader(new FileReader("data.csv"),',' , '"' , 0 );
       List aList=new ArrayList();
      
      String[] nextLine;
      while ((nextLine = reader.readNext()) != null) {
         sj = new StringJoiner(",");;
         if (nextLine != null) {
            for(int i=0;i<nextLine.length;i++)
                sj.add(nextLine[i]);
             
               aList.add(sj.toString());
          
         }
       }


      Iterator itr = aList.iterator();
        while(itr.hasNext())
        {
           String str=itr.next().toString();
           String[] word =str.split(","); 
              for(int i=0;i<word.length;i++)
               System.out.print(word[i]+"     ");
           System.out.print("\n");
        }
      }
   catch(Exception e){}

  

    
        
   }
}

