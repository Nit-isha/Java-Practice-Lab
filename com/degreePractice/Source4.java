package com.degreePractice;

class CompanyJobRepositiory {
	
	static String getJobPrediction (int age, String highestQualification) {
		
		try {
			
			if (age < 19) {
				throw new NotEligibleException("You are underage for any job");
			}
			else if (age >= 21 && age < 26 && highestQualification == "B.E") {
				return "We have openings for junior developer";
			}
			else if (age >= 26 && (highestQualification == "M.S" || highestQualification == "PhD")) {
				return "We have openings for senior developer";
			}
			else if (age >= 19 && (highestQualification != "B.E" || highestQualification != "M.S" || highestQualification != "PhD")){
				throw new NotEligibleException("We do not have any job that matches your qualifications");
			}
			else {
				return "Sorry we have no openings for now";
			}
		} 
		catch (NotEligibleException e) {
			return e.getMessage();
		}
	}
}

public class Source4 {
	
	public String searchforJob (int age, String highestQualification) {
		
		try {
			if (age <= 0 || age >= 200) {
				throw new NotEligibleException("The age entered is not typical for a human being");
			}
			else {
				try {
					String res = CompanyJobRepositiory.getJobPrediction(age, highestQualification);
					return res;
					
				} catch (Exception e) {
					return e.getMessage();
				}
			}
		} catch (NotEligibleException e) {
			return e.getMessage();
		}
	}
	
	public static void main(String[] args) {
		Source4 obj1 = new Source4();
		
		
		System.out.println(obj1.searchforJob(230, "B.E"));
		System.out.println(obj1.searchforJob(-230, "B.E"));
		System.out.println(obj1.searchforJob(23, "B.E"));
		System.out.println(obj1.searchforJob(18, "B.E"));
		System.out.println(obj1.searchforJob(27, "B.E"));
		System.out.println(obj1.searchforJob(29, "M.S"));
		System.out.println(obj1.searchforJob(20, "Bo.E"));

	}
}

class NotEligibleException extends Exception {
	public NotEligibleException(String msg) {
		super(msg);
	}
}