import java.io.*;
import java.util.*;
class MoveFile
{
	private HashMap<String,Integer> hm=new HashMap<String,Integer>(); 
        public void listFilesAndFilesSubDirectories(String directoryName)
	{
              File directory = new File(directoryName);
              File[] fList = directory.listFiles();
              for (File file : fList)
	      {
                       if (file.isFile())
		       {
                       		String name = file.getName(); 
				File dFiles[]=(new File("/home/cb-vishal/dest")).listFiles();
				boolean flag=false;
				for(File f:dFiles)
				{
					if(name.equals(f.getName()))
					{
						flag=true;
						try{
						String newName=name.substring(0,name.indexOf("."));
						newName+="1";
						newName+=name.substring(name.indexOf("."));
						//System.out.println(newName);
						file.renameTo(new File("/home/cb-vishal/dest/"+newName));
						}catch(Exception e){}
						
					}	
				}
				if(!flag)
					file.renameTo(new File("/home/cb-vishal/dest/"+file.getName()));
                       } 
                       else if (file.isDirectory())
                       {
                      		listFilesAndFilesSubDirectories(file.getAbsolutePath());

                        }

              }
	}
        
  	public static void main(String ar[])
   	{
    		MoveFile mf=new MoveFile();
    		mf.listFilesAndFilesSubDirectories("/home/cb-vishal/source");
    		
    	}
}
