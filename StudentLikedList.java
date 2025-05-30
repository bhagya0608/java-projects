package javaproj0ect;

public class StudentLikedList {
	
	public static void main(String[] args) {
		LinkedList<String> students = new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter names of 5 students:");
		 
		for(int i=0;i<5;i++) {
			System.out.println("Enter name of students"+i+":");
			String name=sc.nextInt();
			student.add(name);
		}
		System.out.println("Students names are:");
		for(String student:students) {
			System.out.println(student);
		}
		sc.close();
		
			
		}
	}
	
