package phoneBook;
import java.util.*;
public class Numbers {
	private String fax;
	private String mobile;
	private String primaryPhone;
	private Person person;
	
	public Numbers() {
		
	}
	public Numbers(String fax, String mobile, String primaryPhone) {
		this.fax = fax;
		this.mobile = mobile;
		this.primaryPhone = primaryPhone;
	}
	public void addPerson(String city, String streetAddress, String state, int zipCode, String name) {
		Person temp = new Person(city, streetAddress, state, zipCode, name);
		this.person = temp;
	}
	public Person getPerson() {
		return person;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPrimaryPhone() {
		return primaryPhone;
	}
	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}
	public void printNumber() {
		person.printPerson();
		java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}");
        //suposing a grouping of 3-3-4
    String[] phoneNumArr={primaryPhone.substring(0, 3),
    		primaryPhone.substring(3,6),
    		primaryPhone.substring(6)};
    String[] mobileNumArr={mobile.substring(0, 3),
    		mobile.substring(3,6),
    		mobile.substring(6)};

		System.out.println("Primary: "+ phoneMsgFmt.format(phoneNumArr) +"\nMobile: "+ phoneMsgFmt.format(mobileNumArr) +"\nFax: "+ fax);
		System.out.println("--------------------------------------------------------");
	}
	}