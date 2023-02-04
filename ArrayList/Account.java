package ArrayList;

public class Account {
	private String hoName;
	private long acNo;
	private String city;
	private String ifsc;
	private long cuNo;
	private int pswrd;
	private double accBal;
	public Account(String hoName, long acNo, String city, String ifsc, long cuNo, int pswrd, double accBal) {
		super();
		this.hoName = hoName;
		this.acNo = acNo;
		this.city = city;
		this.ifsc = ifsc;
		this.cuNo = cuNo;
		this.pswrd = pswrd;
		this.accBal = accBal;
	}
//	Overide toString Method
	public String toString() {
		return hoName +"\n"+acNo +"\n"+city+"\n"+ifsc+"\n"+cuNo+"\n"+pswrd+"\n"+accBal;
	}
	public String getHoName() {
		return hoName;
	}
	public void setHoName(String hoName) {
		this.hoName = hoName;
	}
	public long getAcNo() {
		return acNo;
	}
	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public long getCuNo() {
		return cuNo;
	}
	public void setCuNo(long cuNo) {
		this.cuNo = cuNo;
	}
	public int getPswrd() {
		return pswrd;
	}
	public void setPswrd(int pswrd) {
		this.pswrd = pswrd;
	}
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	
}
