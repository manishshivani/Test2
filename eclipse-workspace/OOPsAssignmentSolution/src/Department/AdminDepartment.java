package Department;

public class AdminDepartment extends SuperDepartment{
	
	/**
	 * AdminDepartment contains 3 methods of return type String: departmentName, getTodaysWork, getWorkDeadline 
	 */
	
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
