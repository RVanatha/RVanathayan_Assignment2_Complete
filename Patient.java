
public class Patient {
	
	//Fields
	private String firstName, middleName, lastName, streetAddress, city, state, phoneNumber, emergNumber, emergName, zipCode;
	
	//Constructors
	public Patient() {
		firstName = "Unknown";
		middleName = "Unknown";
		lastName = "Unknown";
		streetAddress = "Unknown";
		city = "Unknown";
		state = "Unknown";
		phoneNumber = "Unknown";
		emergNumber = "Unknown";
		emergName = "Unknown";
		zipCode = "Unknown";
		
	}
	public Patient(String first, String middle, String last) {
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, 
				   String state, String zipCode, String phoneNumber, String emergNumber, String emergName) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.emergNumber = emergNumber;
		this.emergName = emergName;
		this.zipCode = zipCode;
		
	}
	
	//Mutators//
	public void setFirstName(String n) {
		firstName = n;
	}
	
	public void setMiddleName(String n) {
		middleName = n;
	}
	
	public void setLasteName(String n) {
		lastName = n;
	}
	
	public void setStreetAddress(String n) {
		streetAddress = n;
	}
	
	public void setCity(String n) {
		city = n;
	}
	
	public void setState(String n) {
		state = n;
	}
	
	public void setPhoneNumber(String n) {
		phoneNumber = n;
	}
	
	public void setEmergNumber(String n) {
		emergNumber = n;
	}
	
	public void setEmergName(String n) {
		emergName = n;
	}
	
	public void setZipCode(String n) {
		zipCode = n;
	}
	
	//Accessors//
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getEmergNumber() {
		return emergNumber;
	}
	
	public String getEmergName() {
		return emergName;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	//Methods//
	public String buildFullName() {
		String fullName;
		fullName = firstName + " "+ middleName+ " "+ lastName;
		return fullName;
	}
	
	public String buildAddress() {
		String fullAddress;
		fullAddress = streetAddress + " "+ city+ " "+ state + " "+ zipCode;
		return fullAddress;
	}
	
	public String buildEmergencyContact() {
		String fullEmergContact;
		fullEmergContact = emergName+" "+ emergNumber;
		return fullEmergContact;
	}
	
	//toString Method
	public String toString() {
		String fullName = buildFullName();
		String address = buildAddress();
		String emergContact = buildEmergencyContact();
		return fullName +"\n"+ address +"\n"+ emergContact;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
