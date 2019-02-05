public class Book {
	
	private Integer refNum;
	private String title;
	private String author;
	private boolean checkedIn;
	private String dueDate;
	
	// constructors 
		// empty constructor
		Book(){};
		
		// new book that's automatically checked in and not checked out
		Book(Integer refNum, String title, String author){
			setRefNum(refNum);
			setTitle(title);
			setAuthor(author);
			setCheckedIn(true);
			setDueDate(null);
		}
		
		// new book that may or may not be checked in
		Book(Integer refNum, String title, String author, boolean checkedIn, String dueDate){
			setRefNum(refNum);
			setTitle(title);
			setAuthor(author);
			setCheckedIn(checkedIn);
			setDueDate(dueDate);
		}
	
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
	
	public String getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Book [refNum=" + refNum + ", title=" + title + ", author=" + author + ", checkedIn=" + checkedIn
				+ ", dueDate=" + dueDate + "\n";
	}


}
