import java.io.*;
import java.util.*;
import java.util.HashMap;
class Mapprefix
{
    public static void main(String ar[])
     {
        String[] str ={"vishzl","raju","ajit","krish","vaibhav","vishkr","ajitkr"};
 
       HashMap< String,Vector<String> > hmap=new HashMap< String, Vector<String> >();
        int len=str.length;
        Vector<String> vs;
        for(int i=0;i<len;i++)
         {
           String s2 = str[i].substring(0,3);
           
            if(hmap.containsKey(s2))
               {
                 vs=hmap.get(s2);
                 vs.add(str[i]);
               }
            else
              {
                 vs=new Vector<String>();
                 vs.add(str[i]);
                 hmap.put(s2,vs);
               }
          }
       for (HashMap.Entry< String, Vector<String> > entry : hmap.entrySet()) {
                System.out.print("Key: " + entry.getKey()+"   Value:");
                vs=hmap.get(entry.getKey());
                Collections.sort(vs);
                for(int i=0; i< vs.size(); i++){
                System.out.print("  "+vs.elementAt(i));
             
             }
             System.out.println("\n");
      
            }
    }
}
