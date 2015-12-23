import java.io.*;
import java.util.*;
import java.util.HashMap;
class MapDemo
{
    public static void main(String ar[])
     {
        String[] str ={"vishal","raju","ajit","krish","vaibhav",null,""};
 
       HashMap< Integer,Vector<String> > hmap=new HashMap< Integer, Vector<String> >();
       int len=str.length;
       Vector<String> vs;
        for(int i=0;i<len;i++)
         {
            if(hmap.containsKey(str[i].length()))
               {
                 vs=hmap.get(str[i].length());
                 vs.add(str[i]);
               }
            else
              {
                vs=new Vector<String>();
                vs.add(str[i]);
                 hmap.put(str[i].length(),vs);
               }
          }
       for (HashMap.Entry< Integer, Vector<String> > entry : hmap.entrySet()) {
                System.out.print("Key: " + entry.getKey());
                vs=hmap.get(entry.getKey());
                for(int i=0; i< vs.size(); i++){
                System.out.print("  "+vs.elementAt(i));
             
             }
             System.out.println("\n");
      
            }
    }
}
