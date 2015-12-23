import java.io.*;
import java.util.*;
class Person
 {
   private String name;
   private String add;
   


    public void setName(String name)
     {
       this.name=name;
     }
    public void setAddress(String add)
     {
       this.add=add;
     }
    
   public String getName()
     {
       return name;
     }
    public String getAddress()
     {
       return add;
     }

}

class PhoneDirectory
{
 private String mobile;
 private String home;
 private String work;
 private Person person;
 public void setMobile(String mobile)
   {
    this.mobile=mobile;
   } 
  public void setHome(String home)
  {
    this.home=home;
   } 

  public void setWork(String work)
  {
    this.work=work;
   } 


  public String getMobile()
  {
    return mobile;
   } 

  public String getHome()
  {
    return home;
   } 
  public String getWork()
  {
    return work;
  }
  public void setPerson(Person person)
  {
   this.person=person;
  }
 public Person getPerson()
 {
  return person;
 }
 public static void main(String ar[])
  {
   Scanner s=new Scanner(System.in);
   ArrayList<PhoneDirectory> phone=new ArrayList<PhoneDirectory>();
    Person p1=new Person();
    p1.setName("vishal");
    p1.setAddress("Chennai");

    Person p2=new Person();
    p2.setName("raju");
    p2.setAddress("Chennai");

    PhoneDirectory d1=new PhoneDirectory();
    d1.setMobile("9834542317");
    d1.setHome("0441234346");
    d1.setWork(null);
    d1.setPerson(p1);
    phone.add(d1);

    PhoneDirectory d2=new PhoneDirectory();
    d2.setMobile("8034542317");
    d2.setHome("0441234346");
    d2.setWork("0441234323");
    d2.setPerson(p2);
    phone.add(d2);
    
     //PhoneDirectory obj=null;
    while(true)
     {
         System.out.println("1.Search by name");
         System.out.println("2.Search by phone");
         System.out.println("3.exit");
         int ch=s.nextInt();
           Iterator it;
           int f;
          switch(ch)
          {
             case 1: System.out.println("Enter name::");
                      s.nextLine();
                     String name=s.nextLine();
                      it=phone.iterator();
                      f=1;
                     while(it.hasNext())
                      {
                       PhoneDirectory obj=(PhoneDirectory)it.next();
                       Person p=obj.getPerson();
                        if(name.equals(p.getName()))
                         {
                          System.out.println("Name::"+p.getName());
                          System.out.println("Address::"+p.getAddress());
                          System.out.println("Mobile::"+obj.getMobile());
                          System.out.println("Home::"+obj.getHome());
                          System.out.println("Work::"+obj.getWork());
                           f=0;
                         }
                       }
                       if(f==1)
                        System.out.println("Record not found");
                      break;
               case 2:
                     System.out.println("Enter phone::");
                      s.nextLine();
                     String phone1=s.nextLine();
                      it=phone.iterator();
                     f=1;
                     while(it.hasNext())
                      {
                       PhoneDirectory obj=(PhoneDirectory)it.next();
                       Person p=obj.getPerson();
                        if(phone1.equals(obj.getMobile())||phone1.equals(obj.getHome())||phone1.equals(obj.getWork()))
                         {
                          System.out.println("Name::"+p.getName());
                          System.out.println("Address::"+p.getAddress());
                          System.out.println("Mobile::"+obj.getMobile());
                          System.out.println("Home::"+obj.getHome());
                          System.out.println("Work::"+obj.getWork());
                           f=0;
                           break;
                         }
                       }
                       if(f==1)
                        System.out.println("Record not found");
                      break;
                 case 3: 
                         System.exit(0);
                    
              }
       }
   }
}
