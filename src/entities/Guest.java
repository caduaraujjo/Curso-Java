package entities;

public class Guest {
	String name;
	String email;
	Integer room;
	public Guest(String name, String email, Integer room) {
		super();
		this.name = name;
		this.email = email;
		this.room = room;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRoom() {
		return room;
	}
	public void setRoom(Integer room) {
		this.room = room;
	}
	
	
}
