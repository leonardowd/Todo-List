package entity;

public class Task {

	private int status = 0;
	private String value;
	
	public Task(String value, int status) {
		this.value = value;
		this.status = status;
	}
	
	public Task() {
		
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public boolean isCompleted() {
		
		return status == 1;
	}

	@Override
	public String toString() {
		return "Task=" + value;
	}
	
	
}
