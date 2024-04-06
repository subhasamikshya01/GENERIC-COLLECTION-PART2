package Q4;
import java.util.LinkedList;
import java.util.Scanner;
class Student{
	String name;
	int age;
	double mark;
	public Student(String name, int age, double mark) {
		super();
		this.name = name;
		this.age = age;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public String toString() {
		return "NAME:"+name+" AGE:"+age+" MARK:"+mark;
	}
	
}
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Student>l=new LinkedList<Student>();
		l.add(new Student("N1",20,52.3));
		l.add(new Student("N1",20,58.6));
		l.add(new Student("N1",20,65.5));
		l.add(new Student("N1",20,86.6));
		l.add(new Student("N1",20,87.5));
		for(Student c:l) {
			System.out.println(c);
		}
		System.out.println("Enter student object you want to search:- ");
		System.out.println("Enter name:- ");
		String name=sc.next();
		System.out.println("Enter age:- ");
		int age=sc.nextInt();
		System.out.println("Enter mark:- ");
		double mark=sc.nextDouble();
		Student n=new Student(name,age,mark);
		boolean res=ispresent(l,n);//the object is searched according to contain
		if(res) {
			System.out.println("Student present");
		}
		else {
			System.out.println("Student absent");
		}
		System.out.println("Enter the student object you want to remove:- ");
		System.out.println("Enter name:- ");
		String name1=sc.next();
		System.out.println("Enter age:- ");
		int age1=sc.nextInt();
		System.out.println("Enter mark:- ");
		double mark1=sc.nextDouble();
		Student n1=new Student("N1",20,85.8);
		l.remove(n1);
		System.out.println("Student removed!");
		System.out.println("New list is:- ");
		for(Student c:l) {
			System.out.println(c);
		}
		
	}
	public static boolean ispresent(LinkedList<Student>l,Student key) {
		if(l.contains(key)) {
			return true;
		}
		return false;
	}

}
