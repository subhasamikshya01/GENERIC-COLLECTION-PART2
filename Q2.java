package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User{
	private String name;
	private int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
}
class ArrayListUser{
	private ArrayList<User> ul;

	public ArrayListUser() {
		super();
		ul=new ArrayList<>();
	}
	public void adduser(User u) {
		ul.add(u);
	}
	public void display() {
		for(User u:ul) {
			System.out.println("name:- "+u.getName()+" age:- "+u.getAge());
		}
	}
	public void sort(){
		for(int i=0;i<ul.size()-1;i++) {
			for(int j=0;j<ul.size()-i-1;j++) {
				if(ul.get(j).getAge()>ul.get(j+1).getAge()) {
					User t=ul.get(j);
					ul.set(j, ul.get(j+1));
					ul.set(j+1, t);
				}
			}
		}
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		ArrayListUser alu=new ArrayListUser();
		alu.adduser(new User("Name1",74));
		alu.adduser(new User("Name2",54));
		alu.adduser(new User("Name3",14));
		System.out.println("before sorting:- ");
		alu.display();
		alu.sort();
		System.out.println("after sorting:- ");
		alu.display();
	}

}
