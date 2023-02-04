package Core_Java;

public class Account {
             private String anHolderName;
             private long acNo;
             private String ifsc;
             private long contNum;
             private String city;
             private int passw;
			public Account(String anHolderName, long acNo, String ifsc, long contNum, String city, int passw) {
				this.anHolderName = anHolderName;
				this.acNo = acNo;
				this.ifsc = ifsc;
				this.contNum = contNum;
				this.city = city;
				this.passw = passw;
			}
			public String getAnHolderName() {
				return anHolderName;
			}
			public void setAnHolderName(String anHolderName) {
				this.anHolderName = anHolderName;
			}
			public long getAcNo() {
				return acNo;
			}
			public void setAcNo(long acNo) {
				this.acNo = acNo;
			}
			public String getIfsc() {
				return ifsc;
			}
			public void setIfsc(String ifsc) {
				this.ifsc = ifsc;
			}
			public long getContNum() {
				return contNum;
			}
			public void setContNum(long contNum) {
				this.contNum = contNum;
			}
			public String getCity() {
				return city;
			}
			public void setCity(String city) {
				this.city = city;
			}
			public int getPassw() {
				return passw;
			}
			public void setPassw(int passw) {
				this.passw = passw;
			}
}
