package entity;

public class Task {

	private int status;
	private String value;
	
	public Task(String value, int status) {
		this.value = value;
		this.status = status;
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
	
	
}
