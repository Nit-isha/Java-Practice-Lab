package com.degreePractice;


import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.stream.*;

class Employee {

    String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
		
	}
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {
        BYNAME, BYSALARY
    };

    public List<Employee> sort(List<Employee> emps, final SortMethod method){
        List<Employee> list = null;

        switch(method){
            case BYNAME:
                list = emps.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
                break;
            case BYSALARY:
                list = emps.stream().sorted((e1,e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1).collect(Collectors.toList());
                break;
        }
        return list;
    }

    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
        
        return entities.stream().allMatch(p -> p.getName().toLowerCase().contains(character.toLowerCase()));
    }
}
//import java.util.*;
//import java.util.stream.Stream;
//
//class Employee {
//	
//	String name;
//	int salary;
//	
//	public Employee(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//		
//	}
//	
//    public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//
//	@Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder("<");
//        sb.append("name: ");
//        sb.append(name);
//        sb.append(" salary: ");
//        sb.append("" + salary+">");
//        return sb.toString();
//
//    }
//}
//
//class EmployeeInfo{
//	enum SortMethod {
//		BYNAME, BYSALARY; 
//	}
//    
//    public List<Employee> sort (List<Employee> emps, final SortMethod method) {
//    	List<Employee> list = null;
//
//        switch(method){
//            case BYNAME:
//                list = emps.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
//                break;
//            case BYSALARY:
//                list = emps.stream().sorted((e1,e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1).collect(Collectors.toList());
//                break;
//        }
//        return list;	
//    }
//}
//
public class Source5 {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee("Mickey", 100000));
		emps.add(new Employee("Timmy", 50000));
		emps.add(new Employee("Annny", 40000));
		
		EmployeeInfo empInfo = new EmployeeInfo();

		


	}
}
