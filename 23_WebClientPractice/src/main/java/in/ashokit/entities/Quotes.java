package in.ashokit.entities;

public class Quotes {
	
	private String id;
	private String quote;
	private String author;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Quotes [id=" + id + ", quote=" + quote + ", author=" + author + "]";
	}
	
	

}
