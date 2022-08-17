package entity;

public class Task {

	private String status = "";
	private String value;
	
	public Task(String value, String status) {
		this.value = value;
		this.status = status;
	}
	
	public Task() {
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public boolean isCompleted() {
		
		return status == "(DONE)";
	}

	@Override
	public String toString() {
		return " " + value;
	}
	
}
