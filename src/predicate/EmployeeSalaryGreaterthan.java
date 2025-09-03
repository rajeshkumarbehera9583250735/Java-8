
//Display the names and salary of employees whose salary is greater than 30000

package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

class Employee{
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class EmployeeSalaryGreaterthan {

	public static void main(String[] args) {
		ArrayList<Employee> emp =new ArrayList<>(Arrays.asList(
					new Employee("Alekha",33000),
					new Employee("Tukuna",25000),
					new Employee("Dipu",30000),
					new Employee("Lipu",35000),
					new Employee("chandan",24000)
		));
		
		Predicate<Employee> pr= e ->e.salary > 30000;
		for(Employee e : emp) {
			if(pr.test(e)) {
				System.out.println(e.name+ " : "+e.salary);
			}
		}
	}

}
