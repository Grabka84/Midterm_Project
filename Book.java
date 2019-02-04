import java.util.Date;

public class Book {
	
	private Integer refNum;
	private String title;
	private String author;
	private boolean checkedIn;
	private Date dueDate;
	
	// getters and setters for each field
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean getCheckedIn() {
		return checkedIn;
	}
	
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	public Integer getRefNum() {
		return refNum;
	}
	
	public void setRefNum(Integer refNum) {
		this.refNum = refNum;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	@Override
	public String toString() {
		String isCheckedIn = "";
		String dueBy = "";
		if (getCheckedIn()) {
			isCheckedIn = "available.";
		} else {
			isCheckedIn = "checked out, ";
			dueBy = "and is due back by " + getDueDate();
		}
		return "Book #" + getRefNum() + ": " + getTitle() + " by " + getAuthor() + " is " + isCheckedIn + dueBy;  
				
	}

}
