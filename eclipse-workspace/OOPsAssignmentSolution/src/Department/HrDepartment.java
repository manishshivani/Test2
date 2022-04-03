package Department;

public class HrDepartment extends SuperDepartment {
	
	/**
	 * HrDepartment contains 4 methods of return type String: departmentName, getTodaysWork, getWorkDeadline, doActivity 
	 */
	
	
	public String departmentName () {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
	

}
