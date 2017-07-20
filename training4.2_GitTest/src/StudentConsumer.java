
public class StudentConsumer {
	
	public static void main(String[] args)
	{
		
		Student s1 = new Student();
		s1.setName("Ion");
		s1.setAge(18);
		
		System.out.println("Hello student with name " + s1.getName() + " !");
		StudentConsumer.displayAge(s1);
	}
	
	public static void displayAge(Student s){
		
		long age = s.getAge();
		System.out.println(age);
		System.out.println("#######");

		System.out.println("#t2#");
		

		System.out.println("#t1#");
	}

}
