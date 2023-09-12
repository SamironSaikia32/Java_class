package assignment;

class Student {
	
	String name;
	String id;
	int age;
	
	Student(String n, String i, int a){
		name = n;
		id = i;
		age = a;
	}
	
	//Method to display details
	void display() {
		System.out.println("\nName : "+ name);
		System.out.println("id : "+ id);
		System.out.println("age : "+age);
	}
	
}

public class StudentProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student("Samiron", "CSE-32/20", 22);
		std1.display();
		
		Student std2 = new Student("Mrinav", "CSE-19/20", 22);
		std2.display();

	}

}
