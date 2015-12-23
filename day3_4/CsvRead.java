import java.io.*;
import java.util.*;
class CsvRead{
  public static void main(String ar[])
   {

     
     StringJoiner sj;
     String[][] record=new String[][]{
        {"vishal","chennai","7811020213","7685432134","8976542314"},
        {"raju","chennai","7811020212","9985432134","9076542314"},
        {"ajit","chennai","7811020219","7685432134","8976542334"},
        {"vaibhav","chennai","8811020213","7685432134","8976542312"},
        {"vishal","chennai","9011020213","9085432134","5676542314"}};
   try{
       File outputFile=new File("phoneDirectory.csv");
       FileWriter out = new FileWriter(outputFile);
       sj = new StringJoiner(",");
       sj.add("NAME");
       sj.add("ADDRESS");
       sj.add("MOBILE"); 
       sj.add("HOME");
       sj.add("WORK\n");
       out.write(sj.toString());
       for(int i=0;i<5;i++)
       {
          sj = new StringJoiner(",");
         for(int j=0;j<5;j++)
           {
              sj.add(record[i][j]);
           }
          
         out.write(sj.toString());
         out.write("\n");
       }
       out.close();




       File r=new File("phoneDirectory.csv");
       FileReader readerFile1 = new FileReader(r);
       BufferedReader br1 = new BufferedReader(readerFile1);
       
       String line;
      
       ArrayList<String> aList=new ArrayList<String>();
       
    
      while((line = br1.readLine()) != null)
       {
     
        aList.add(line);
       }
       Iterator itr = aList.iterator();
        while(itr.hasNext())
        {
           String str=itr.next().toString();
           String[] word = str.split(",");
              for(int i=0;i<word.length;i++)
               System.out.print(word[i]+"     ");
           System.out.print("\n");
        }
       }
   catch(Exception e){}


    
        
   }
}

