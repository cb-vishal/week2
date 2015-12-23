import java.io.*;
import java.util.*;
import com.google.gson.Gson;
class Student
{
   private String sid;
   private String date_Of_Join;
   private List<Marks> marks;
   private String name;
   private String std;
   

   public void setSid(String sid)
    {
      this.sid=sid;
    } 

    public void setDate_Of_Join(String sid)
    {
      this.date_Of_Join=date_Of_Join;
    } 

    public void setMarks(List<Marks> marks)
    {
      this.marks=marks;
    } 

    public void setName(String name)
    {
      this.name=name;
    } 

    public void setStd(String std)
    {
      this.std=std;
    } 

   public String getSid()
    {
      return sid;
    } 

    public String getDate_Of_Join()
    {
      return date_Of_Join;
    } 

    public List<Marks> getMarks()
    {
      return marks;
    } 

    public String getName()
    {
      return name;
    } 

    public String getStd()
    {
      return std;
    } 
  @Override
	public String toString() {
		return "Student [Date of joining=" + date_Of_Join + ", ID=" + sid + ", " +
				"Marks=" + marks +", Name=" + name +", STD=" + std + "]";
	}
}


class Marks
{
    private int mark;
    private String sub;
    


     public void setMark(int mark)
      {
       this.mark=mark;
       }
     public void setSub(String sub)
      {
       this.sub=sub;
      }
}

class Teacher
{
  private List<String> class_Taking;
  private String date_Of_Join;
  private String id;
  private String name;
  private int salary;
  


   public void setClass_Taking(List<String> class_Taking)
    {
      this.class_Taking=class_Taking;
    }
    
   public void setDate_Of_Join(String date_Of_Join)
    {
      this.date_Of_Join=date_Of_Join;
    }
   
  public void setId(String id)
    {
      this.id=id;
     }

   public void setName(String name)
    {
     this.name=name;
     }
  public void setSalary(int salary)
   {
    this.salary=salary;
    }

    @Override
	public String toString() {
		return "Teacher [Classes Taking Care Of=" + class_Taking + ", Date Of Joining=" + date_Of_Join + ", " +
				"ID=" + id +", Name=" + name +", Salary=" + salary + "]";
	}
}



class JsonDemo
{

   public static void main(String ar[])
    {
     List<Marks>  ml=new ArrayList<Marks>();
     Marks  m1=new Marks();
     m1.setMark(80);
     m1.setSub("c");
     ml.add(m1);

    Marks  m2=new Marks();
     m2.setMark(90);
     m2.setSub("c++");
     ml.add(m2);

    Marks  m3=new Marks();
     m3.setMark(80);
     m3.setSub("java");
     ml.add(m3);

    Teacher t=new Teacher();
    List<String>  ts=new ArrayList<String>();
    ts.add("viii");
    ts.add("ix");
    ts.add("x");
    t.setClass_Taking(ts);
     t.setDate_Of_Join("10-12-1990");
    t.setId("Emp101");
    t.setName("vaibhav");
    t.setSalary(20000);


   Student s=new Student();
   s.setSid("s102");
   s.setDate_Of_Join("10-12-2014");
   s.setMarks(ml);
   s.setName("vishal");
   s.setStd("x");

Gson gson = new Gson();

	// convert java object to JSON format,
	// and returned as JSON formatted string
	String json = gson.toJson(s);
        String json1 = gson.toJson(t);

	try {
		//write converted json data to a file named "file.json"
		FileWriter writer = new FileWriter("file.json");
		writer.write(json);
                writer.write(json1);
		writer.close();

	} catch (IOException e) {
		e.printStackTrace();
	}
    
}
}

