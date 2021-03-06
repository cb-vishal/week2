import java.io.*;
import java.nio.file.*;
import java.util.*;
class SearchWord
{
	public static void main(String args[])throws IOException
	{
		HashMap<Integer,ArrayList<Integer>> hashmap=new HashMap<Integer,ArrayList<Integer>>();
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the file Name=");
		String fileName=input.readLine();
		System.out.print("Enter Search word=");
		String searchWord=input.readLine();
		try
		{
			Path path=Paths.get(fileName);
			if(Files.exists(path))
			{
				String line=null;	
				int lineNo=0;
				ArrayList<Integer> al=null;			
				BufferedReader read=new BufferedReader(new FileReader(fileName));
				while((line=read.readLine())!=null)
				{	
					lineNo++;
					String words[]=line.split(" ");
					int index=0;
					boolean flag=true;
					for(String word:words)
					{
						//System.out.print(word+" ");
						if(word.equals(searchWord))
						{
							if(flag)
							{
								al=new ArrayList<Integer>();
								al.add(index);
								hashmap.put(lineNo,al);	
								flag=false;
							}
							else
							{
								al=hashmap.get(lineNo);
								al.add(index);
								hashmap.put(lineNo,al);	
							}
						}
						index++;
								
					}
				}
			}
			if(Files.notExists(path))
			{
				System.out.println("Given File is Not Exist");
				return;
			}
		}
		catch(Exception e)
		{}
		try 
		{
        	    	FileWriter writer = new FileWriter("SearchWord.txt", true);
			for(Map.Entry me:hashmap.entrySet())
			{
				//System.out.println(me.getKey()+"=");
				writer.write("["+me.getKey()+"]:");
				ArrayList<Integer> al=hashmap.get(me.getKey());
				Iterator it=al.iterator();
				while(it.hasNext())
				{
					writer.write(" ,<"+it.next()+">");
				}
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
