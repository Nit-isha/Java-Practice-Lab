package com.degreePractice;

import java.util.*;
import java.util.stream.Collectors;

class Candidate{
	private String name;
	private int id;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	public Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
}


class Implementation{
	
	public static Map<String, Long> getCount(List<Candidate> list) {	
        Map<String, Long> map = new HashMap<String, Long>();

        map = list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
        return map;
    }

    public static Map<String, Double> getAverageAge(List<Candidate> list) {
        Map<String, Double> map = new HashMap<String, Double>();

        map = list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.averagingInt(Candidate::getAge)));
        return map;
	  }

    public static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list) {
        Map<String, Long> map = new HashMap<String, Long>();
        
        map = list.stream().collect(Collectors.groupingBy(Candidate::getDepartment, Collectors.counting()));
        return map;
	  }

    public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
        Optional<Candidate> opt = list.stream().filter(p -> p.getGender().equals("Male"))
                                .filter(p -> p.getDepartment().equals("Product Development"))
                                .max((p1,p2) -> p1.getAge()<p2.getAge() ? 1 : -1);
        return opt;

    }
	
}
//    public static Map<String, Long> getCount(List<Candidate> list) {
//    	Map<String, Long> map = new HashMap<String, Long>();
//
//        map = list.stream().collect(Collectors.groupingBy(Candidate::getGender, Collectors.counting()));
//    	return map;
////		int maleCount = (int) list.stream().filter(p -> p.getGender().equals("Male")).count();
////		int femaleCount = (int) list.stream().filter(p -> p.getGender().equals("Female")).count();
////		
////		Map<String, Long> map = new HashMap<String, Long>();
////
////	    if (maleCount <= femaleCount) {
////	      if (maleCount != 0) {
////	        map.put("Male", Long.valueOf(maleCount));
////	      }
////	      if (femaleCount != 0) {
////	        map.put("Female", Long.valueOf(femaleCount));
////	      }
////	    }
////	
////	    else {
////	      if (femaleCount != 0) {
////	        map.put("Female", Long.valueOf(femaleCount));
////	      }
////	      if (maleCount != 0) {
////	        map.put("Male", Long.valueOf(maleCount));
////	      }
////	    }
////			// map.put("Male", maleCount);
////			// map.put("Female", femaleCount);
////			
////			return map;
//	    }
//	    
//	    public static Map<String, Double> getAverageAge(List<Candidate> list) {
//	      int maleCount = (int) list.stream().filter(p -> p.getGender().equals("Male")).count();
//	      int femaleCount = (int) list.stream().filter(p -> p.getGender().equals("Female")).count();
//	      Double maleAvg = 0.0d;
//	      Double femaleAvg = 0.0d;
//	      
//	      if (maleCount != 0) {
//	          maleAvg = list.stream().filter(p -> p.getGender().equals("Male")).mapToDouble(p -> p.getAge()).average().getAsDouble();
//	      }
//	      if (femaleCount != 0) {
//	          femaleAvg = list.stream().filter(p -> p.getGender().equals("Female")).mapToDouble(p -> p.getAge()).average().getAsDouble();
//	      }
//	
//	      Map<String, Double> map = new HashMap<String, Double>();
//	
//	      if (maleCount <= femaleCount) {
//	        if (maleAvg != 0.0D) {
//	          map.put("Male", maleAvg);
//	        }
//	        if (femaleAvg != 0.0D) {
//	          map.put("Female", femaleAvg);
//	        }
//	      }
//	
//	      else {
//	        if (femaleAvg != 0.0D) {
//	          map.put("Female", femaleAvg);
//	        }
//	        if (maleAvg != 0.0D) {
//	          map.put("Male", maleAvg);
//	        }
//	      }
//	      
//	      return map;
//	    }
//	    
//	    static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list){
//	        Map<String, Long> map=new HashMap<>();
//	        map = list.stream().collect(Collectors.groupingBy(Candidate::getDepartment, Collectors.counting()));
//	        return map;
//	      }
////	    
////	    public static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list) {
////	      Map<String, Long> map = new HashMap<String, Long>();
////	      
////	      for (Candidate c: list) {
////	        if (! map.containsKey(c.getDepartment())) {
////	          long countCand = list.stream().filter(p -> p.getDepartment().equals(c.getDepartment())).count();
////	          map.put(c.getDepartment(), countCand);
////	        }
////	        else {
////	          continue;
////	        }
////	      }
////	      return map;
////	    }
////		
//	    public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
//	        Optional<Candidate> opt = list.stream().filter(p -> p.getGender().equals("Male"))
//	            .filter(p -> p.getDepartment().equals("Product Development")).max((p1,p2) -> p1.getAge()<p2.getAge() ? 1 : -1);
//	        return opt;
//	
//	    }
//}
//
//
////class Implementation{
////	public static Map<String, Long> getCount(List<Candidate> list) {
////		long maleCount = list.stream().filter(p -> p.getGender().equals("Male")).count();
////		long femaleCount = list.stream().filter(p -> p.getGender().equals("Female")).count();
////		
////		Map<String, Long> map = new HashMap<String, Long>();
////		map.put("Male", maleCount);
////		map.put("Female", femaleCount);
////		
////		return map;
////	}
////	
////	public static Map<String, Double> getAverageAge(List<Candidate> list) {
////		Double maleAvg = list.stream().filter(p -> p.getGender().equals("Male")).mapToDouble(p -> p.getAge()).average().getAsDouble();
////		Double femaleAvg = list.stream().filter(p -> p.getGender().equals("Female")).mapToDouble(p -> p.getAge()).average().getAsDouble();
////
////		Map<String, Double> map = new HashMap<String, Double>();
////		map.put("Male", maleAvg);
////		map.put("Female", femaleAvg);
////		
////		return map;
////	}
////	
//	public static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list) {
//		Map<String, Long> map = new HashMap<String, Long>();
//		
//		for (Candidate c: list) {
//			if (! map.containsKey(c.getDepartment())) {
//				long countCand = list.stream().filter(p -> p.getDepartment().equals(c.getDepartment())).count();
//				map.put(c.getDepartment(), countCand);
//			}
//			else {
//				continue;
//			}
//		}
//		return map;
//	}
////	
////	public static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
////	    Optional<Candidate> opt = list.stream().filter(p -> p.getGender().equals("Male"))
////	    		.filter(p -> p.getDepartment().equals("Product Development")).max((p1,p2) -> p1.getAge()<p2.getAge() ? 1 : -1);
////	    return opt;
////
////	  }
////
////}

public class Source6 {

	public static void main(String[] args) {
		
		 List<Candidate> list = new ArrayList<>();
		 list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		 list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));
		 list.add(new Candidate(145, "Scarlet Jhonson", 26, "Male", "Product Development", 2014, 32500.0));

		 Implementation obj = new Implementation();
		 System.out.println(obj.getCount(list));
		 System.out.println(obj.getAverageAge(list));
		 System.out.println(obj.countCandidatesDepartmentWise(list));
		 System.out.println(obj.getYoungestCandidateDetails(list));

	}
}
