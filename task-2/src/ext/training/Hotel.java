package ext.training;

public class Hotel {
   private String rating;
   private int Customerperday;
   private int roomNo;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String rating, int customerperday, int roomNo) {
		super();
		this.rating = rating;
		Customerperday = customerperday;
		this.roomNo = roomNo;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public double getCustomerperday() {
		return Customerperday;
	}
	public void setCustomerperday(int customerperday) {
		Customerperday = customerperday;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	
	
}