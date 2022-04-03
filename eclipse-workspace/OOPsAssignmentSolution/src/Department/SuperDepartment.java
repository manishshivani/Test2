package Department;

public class SuperDepartment {
	
	/**
	 * SuperDepartment class is the superclass and all other departments extends it.
	 * SuperDepartment contains 4 methods of return type String: departmentName, getTodaysWork, getWorkDeadline, isTodayAHoliday 
	 * 
	 */
	
	public String departmentName() {
		return "Super Department";
	}
	
	public String getTodaysWork() {
		return "No work as of now";
	}
	
	public String getWorkDeadline() {
		return "NIL";
	}
	
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
