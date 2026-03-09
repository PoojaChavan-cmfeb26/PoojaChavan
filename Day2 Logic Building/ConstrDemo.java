// Constr.
//1. default
//2. para
class Student{
	int id; 
	String name;
	int age;
	float marks;
	static String batch="Feb26";

	Student(){
		id=100;
		name="Harsh";
		age=25;
		marks=85.0f;
	}
	
	Student(int a){
		System.out.println("In one para. constr.");
		System.out.println(a);
	}

	Student(int a, String s, int b, float f){
		id = a;
		name = s;
		age = b;
		marks = f;
	}

	void study(){ 
		System.out.println("Doing Study...");
	}
	void study(String s){ 
		System.out.println("Doing Study... "+s);
		System.out.println(name);
	}
	
	 int studyHours(){
		int hrs = 16;
	return 	hrs;
	}
}

class ConstrDemo{
	public static void main(String vipul[]){
	
	Student s1 = new Student(1,"Vipul",30,50.0f);
	/*	System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.marks);*/
	Student s2 = new Student();	
		/*System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.marks);*/
	Student s3 = new Student();	
		/*System.out.println(s3.id);
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s3.marks);
	System.out.println("ID value after update.");
		s2.id=1000;
		System.out.println(s2.id);
		System.out.println(s3.id);*/

	
		//System.out.println(s1.study());
		//System.out.println(s1.study("Vipul"));
		s1.study();
		s1.study("Vipul");
		s2.study();
		s2.study("Vipul");
		
	}
}