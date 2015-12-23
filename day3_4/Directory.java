import java.io.*;
import java.util.*;
class Directory
{
   private HashMap<String,Integer> hm=new HashMap<String,Integer>(); 

         public void listFilesAndFilesSubDirectories(String directoryName){

              File directory = new File(directoryName);

       

               File[] fList = directory.listFiles();

               for (File file : fList){

                       if (file.isFile()){
                          String name = file.getName();
                          
                           if(hm.containsKey(name.substring(name.lastIndexOf("."))))
                              {
                               
                                hm.put(name.substring(name.lastIndexOf(".")), hm.get(name.substring(name.lastIndexOf("."))) + 1);
                                
                               }
                          else
                           {
                
                            hm.put(name.substring(name.lastIndexOf(".")),1);
                           }  

                          

                       } 
                       else if (file.isDirectory())
                       {

                      listFilesAndFilesSubDirectories(file.getAbsolutePath());

                        }

                 }
        }

     public void display()
      {


         for (HashMap.Entry< String, Integer > entry : hm.entrySet())
                {
                System.out.println("Key: " + entry.getKey()+"    Occurence:  "+hm.get(entry.getKey()));
               
                }

      }

  public static void main(String ar[])
   {

    Directory d=new Directory();
    d.listFilesAndFilesSubDirectories("/home/cb-vishal/vishal/week2/day1");
    d.display();
    }
}
