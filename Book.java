import java.util.Date;

public class Book {
	
	private String title;
	private String author;
	private boolean checkedIn;
	private Integer refNum;
	private Date date;
	
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
	public boolean isCheckedIn() {
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
	
	
}
