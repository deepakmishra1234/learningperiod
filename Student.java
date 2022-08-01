package practiceproject.phase1;	
	public class Student
	{
		String name; 
	    int age;
	    char sec;
	    char gen;
	    int total=0;
	    int percent=0;
	    int sub1=0,sub2=0,sub3=0;
	    
	    Student(int sub1,int sub2,int sub3,String n,int ag,char a,char m)
	    {
	         this.name=n;
	         this.age=ag;
	         this.sec =a;
	         this.gen=m;
	    	 total=sub1+sub2+sub3;
	    	 percent=total/3;
	    }
	    Student(int sub2,int sub3,String n,int ag,char a,char m)
	    {
	    	   this.name=n;
	    	   this.age=ag;
	    	   this.sec=a;
	    	   this.gen=m;
	    	   total=sub2+sub3+sub1;
	    	   percent=total/3;
	    	    }
	    
	    void display()
	    {
	    	System.out.println("Name:"+name +" "+ "age" +age+ " "+"section" +sec+" "+ "gender:"+gen);
	    	System.out.println("Total marks " +total);
	    	System.out.println("Percentage is" +percent);
	    }
		
		
	    public static void main(String args[]) 
	    {
	    	Student s1=new Student(68,89,78, "Sahil",18,'A','M');
	    	Student s2=new Student(69,70,"Swati",19,'A','F');
	    	Student s3=new Student(79,75,"Ashmita",22,'A','F');
	    	Student s4=new Student(60,76,85,"Shyam",21,'B','M');
	    	
	    	s1.display();
	    	s2.display();
	    	s3.display();
	    	s4.display();
	    	
	    }
	}



