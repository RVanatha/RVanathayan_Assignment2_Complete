
public class Procedure {
	
	//Fields
	private String procedureName, procedureDate, practiName;
	private double charges;
	
	//Constructors
	public Procedure() {
		procedureName = "Unknown";
		procedureDate = "Unknown";
		practiName = "Unknown";
		charges = 00000;
	}
	
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
	public Procedure(String procedureName, String procedureDate, String practiName, double charges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practiName = practiName;
		this.charges = charges;
	}
	
	//Mutators
	public void setProcedureName(String n) {
		procedureName = n;
	}
	
	public void setProcedureDate(String n) {
		procedureDate = n;
	}
	
	public void setPractiName(String n) {
		practiName = n;
	}
	
	public void setCharges(double n) {
		charges = n;
	}
	
	//Accessors
	public String getProcedureName() {
		return procedureName;
	}
	
	public String getProcedureDate() {
		return procedureDate;
	}
	
	public String getPractiName() {
		return practiName;
	}
	
	public double getCharges() {
		return charges;
	}
	
	//toString Method
	public String toSrting() {
		return procedureName +"/n"+ procedureDate +"\n"+ practiName +"\n"+
			   charges;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
