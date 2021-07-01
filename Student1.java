import java.util.Scanner;
class Student{
	 String stdname ;
	 String stdstandard ;
     String stdcity;
	
public Student()
{
	stdname ="abcd";
	stdstandard ="9th";
	stdcity ="HYD";
}
public Student(String s, String a, String b)
{
	stdname = s;
	stdstandard = a;
	stdcity = b;
}
protected int totalmarks(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter sci marks :");
	int sci = sc.nextInt();
	System.out.println("Enter mat marks :");
	int mat= sc.nextInt();
	int sum = sci+mat;
	System.out.println("TOTA MARKS"+sum);
	return 0;
}
}
class Studentdetails extends Student{
	  Studentdetails() 
	{
		super.stdname ="oo";
		super.stdstandard = "10th";
		super.stdcity = "Chennai";
	}
	 Studentdetails(String s, String a, String b)
    {
		 super(s,a,b);
	}
	@Override  
	int totalmarks() {
	super.totalmarks();
   }
}
	
class Student1{
public static void main(String[] args) {
	Student obj=new Student();
	obj.totalmarks();

}
}

