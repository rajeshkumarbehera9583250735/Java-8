package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return " [name=" + name + ", age=" + age + "]";
	}
	
}


public class SortStudentNames {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>(
				Arrays.asList(
					new Student("Raju",24),
					new Student("Durga",24),
					new Student("Banty",23),
					new Student("Pratik",25)
				)
		);
		
		students.sort((s1,s2) -> s1.name.compareTo(s2.name));
		System.out.println("After names are sorted in ascending order: "+ students);
	}

}
