package case5;
import java.util.Date;

public class RegistrationForm {
	String name,maritalStatus,sex,address,pEmail,sEmail,pNo,iSub,hEdu,nat;
	int age;
	Date dob;
	public RegistrationForm(String name, String maritalStatus, String sex, String address, String pEmail, String sEmail,
			String pNo, String iSub, String hEdu, String nat, int age, Date dob) {
		super();
		this.name = name;
		this.maritalStatus = maritalStatus;
		this.sex = sex;
		this.address = address;
		this.pEmail = pEmail;
		this.sEmail = sEmail;
		this.pNo = pNo;
		this.iSub = iSub;
		this.hEdu = hEdu;
		this.nat = nat;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getpEmail() {
		return pEmail;
	}
	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getiSub() {
		return iSub;
	}
	public void setiSub(String iSub) {
		this.iSub = iSub;
	}
	public String gethEdu() {
		return hEdu;
	}
	public void sethEdu(String hEdu) {
		this.hEdu = hEdu;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}