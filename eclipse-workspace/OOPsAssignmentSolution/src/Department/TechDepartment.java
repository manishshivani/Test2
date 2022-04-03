package Department;

public class TechDepartment extends SuperDepartment {
	
	/**
	 * TechDepartment contains 4 methods of return type String: departmentName, getTodaysWork, getWorkDeadline, getTechStackInformation 
	 */
	
	public String departmentName() {
		return "Tech Department ";
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	public String getTechStackInformation() {
		return "Core Java";
	}

}
