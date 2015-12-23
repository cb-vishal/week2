import java.io.*;
import java.util.*;
class ReadTextFile
{
	public static void main(String args[])throws IOException
	{
		HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
		try
		{
			File file=new File("abc.txt");
			Scanner scanner=new Scanner(file);
			while(scanner.hasNext())
			{	
				String word=scanner.next();
				if(hashmap.containsKey(word))
				{
					hashmap.put(word,hashmap.get(word)+1);
				}
				else
					hashmap.put(word,1);
				
			}
		}
		catch(Exception e)
		{}
		try 
		{
        	    	FileWriter writer = new FileWriter("out.txt", true);
			Map<String,Integer> hashmap1=new TreeMap<String,Integer>(hashmap);
			for(Map.Entry me:hashmap1.entrySet())
			{
				
				writer.write("["+me.getKey()+"]:["+me.getValue()+"]");
				writer.write("\r\n");
			}
			writer.close();
        	} 
		catch (IOException e) 
		{
            		e.printStackTrace();
        	}

	}
}
