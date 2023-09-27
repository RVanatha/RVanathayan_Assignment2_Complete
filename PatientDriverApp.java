/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: (Give a brief description for each Class)
 * Due: 09/26/2023
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ryan Vanathayan
*/

public class PatientDriverApp {

	public static void main(String[] args) {
		/////Patient Number 1
		Patient p1 = new Patient();
		
		p1.setFirstName("Ryan");
		p1.setMiddleName("Manoj");
		p1.setLasteName("Vanathayan");
		
		p1.setStreetAddress("16529 Harbour Town Dr");
		p1.setCity("Ashton");
		p1.setState("Maryland");
		p1.setZipCode("28601");
		
		p1.setEmergNumber("301-980-8428");
		p1.setEmergName("Sophia");
		
		Procedure p1_Procedure1 = new Procedure();
		p1_Procedure1.setProcedureName("Brain Surgery");
		p1_Procedure1.setProcedureDate("12/10/2024");
		p1_Procedure1.setPractiName("Dr.Pearson");
		p1_Procedure1.setCharges(12644.23);
		
		Procedure p1_Procedure2 = new Procedure("Achilles Surgery", "11/22/2024");
		p1_Procedure2.setPractiName("Dr. Sharpe");
		p1_Procedure2.setCharges(45456.99);
		
		Procedure p1_Procedure3 = new Procedure("ACL Repair", "01/2/2025", "Dr. Jones", 42377.89);

		System.out.println(displayPatient(p1));
		
		System.out.println(displayProcedure(p1_Procedure1));
		System.out.println(displayProcedure(p1_Procedure2));
		System.out.println(displayProcedure(p1_Procedure3));
		
		double total = calculateTotalCharges(p1_Procedure1, p1_Procedure2, p1_Procedure3);
		
		System.out.printf("\nTotal Charges: $%,.2f\n", total);
		
		System.out.println("\nStudent Name: Ryan Vanathayan");
		System.out.println("MC#: M21071079");
		System.out.println("Due Date: 09/26/23");
		System.out.print("\n");
		
		/////Patient Number 2
		Patient p2 = new Patient("Justin", "Ranjit", "Vanathayan");
		
		p2.setStreetAddress("16529 Harbour Town Dr");
		p2.setCity("Ashton");
		p2.setState("Maryland");
		p2.setZipCode("20861");
		
		p2.setEmergNumber("301-641-8184");
		p2.setEmergName("Raheem");
		
		Procedure p2_Procedure1 = new Procedure();
		p2_Procedure1.setProcedureName("Regular Check-up");
		p2_Procedure1.setProcedureDate("11/20/2023");
		p2_Procedure1.setPractiName("Dr.Smith");
		p2_Procedure1.setCharges(1244.23);
		
		Procedure p2_Procedure2 = new Procedure("Physicals", "11/20/2023");
		p2_Procedure2.setPractiName("Dr.Smith");
		p2_Procedure2.setCharges(7689.56);
		
		Procedure p2_Procedure3 = new Procedure("Ankle Surgery", "11/22/2023", "Dr.Bernat", 34678.21);
		
		System.out.println(displayPatient(p2));
		
		System.out.println(displayProcedure(p2_Procedure1));
		System.out.println(displayProcedure(p2_Procedure2));
		System.out.println(displayProcedure(p2_Procedure3));
		
		total = calculateTotalCharges(p2_Procedure1, p2_Procedure2, p2_Procedure3);
		
		System.out.printf("\nTotal Charges: $%,.2f\n", total);
		
		System.out.println("\nStudent Name: Ryan Vanathayan");
		System.out.println("MC#: M21071079");
		System.out.println("Due Date: 09/26/23");
		System.out.print("\n");

		
		/////Patient Number 3
		Patient p3 = new Patient("Vijay", "Pradeep", "Vanathayan", "16529 Harbour Town Dr", "Ashton", "Maryland", "20861",
								  "301-754-8428", "301-451-9808", "Manuel");
		
		Procedure p3_Procedure1 = new Procedure();
		p3_Procedure1.setProcedureName("Check-up");
		p3_Procedure1.setProcedureDate("01/05/2024");
		p3_Procedure1.setPractiName("Dr.Smith");
		p3_Procedure1.setCharges(2323.23);
		
		Procedure p3_Procedure2 = new Procedure("Ankle Surgery", "12/30/2023");
		p2_Procedure2.setPractiName("Dr.Sufian");
		p2_Procedure2.setCharges(78901.56);
		
		Procedure p3_Procedure3 = new Procedure("Hand Surgery", "08/02/2023", "Dr.Ruby", 64678.21);
		
		System.out.println(displayPatient(p3));
		
		System.out.println(displayProcedure(p3_Procedure1));
		System.out.println(displayProcedure(p3_Procedure2));
		System.out.println(displayProcedure(p3_Procedure3));
		
		total = calculateTotalCharges(p3_Procedure1, p3_Procedure2, p3_Procedure3);
		
		System.out.printf("\nTotal Charges: $%,.2f\n", total);
		
		System.out.println("\nStudent Name: Ryan Vanathayan");
		System.out.println("MC#: M21071079");
		System.out.println("Due Date: 09/26/23");
		System.out.print("\n");

		
		//////Patient 4
		Patient p4 = new Patient("Danush", "Rolex", "Sir", "16529 Thousand Lights Dr", "Thousand Lights", "Tamil Nadu", "09876",
				  "240-980-8428", "340-743-2100", "Joe");

		Procedure p4_Procedure1 = new Procedure();
		p4_Procedure1.setProcedureName("Physicals");
		p4_Procedure1.setProcedureDate("07/04/2024");
		p4_Procedure1.setPractiName("Dr.Pearson");
		p4_Procedure1.setCharges(7435.23);
		
		Procedure p4_Procedure2 = new Procedure("MCL Surgery", "09/20/2024");
		p4_Procedure2.setPractiName("Dr.Eisa");
		p4_Procedure2.setCharges(21090.69);
		
		Procedure p4_Procedure3 = new Procedure("Thumb Surgery", "09/23/2024", "Dr.Robby", 1000789.99);
		
		System.out.println(displayPatient(p4));
		
		System.out.println(displayProcedure(p4_Procedure1));
		System.out.println(displayProcedure(p4_Procedure2));
		System.out.println(displayProcedure(p4_Procedure3));
		
		total = calculateTotalCharges(p4_Procedure1, p4_Procedure2, p4_Procedure3);
		
		System.out.printf("\nTotal Charges: $%,.2f\n", total);
		
		System.out.println("\nStudent Name: Ryan Vanathayan");
		System.out.println("MC#: M21071079");
		System.out.println("Due Date: 09/26/23");
		System.out.print("\n");

	}
	
	public static String displayPatient(Patient p) {
	//This method given a patient object will display patient’s information.
		return "Patient Info: "
				+"\n\t"+ p.buildFullName()
				+"\n\t"+ p.buildAddress() 
				+"\n\t"+ p.buildEmergencyContact();
	}
	
	//displayProcedure: This method given a procedure object will display procedure’s information.
	public static String displayProcedure(Procedure p) {
		return "\n\tProcedure: "+ p.getProcedureName() +"\n\tProcedure Date: "+ p.getProcedureDate() +
				"\n\tPractionar: "+ p.getPractiName() +"\n\tCharges: $"+ p.getCharges();
	}
	
	
	//calculateTotalCharges: this method takes three procedures as parameter and returns the 
	//total charges of these procedures.
	public static Double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		double total = p1.getCharges()+ p2.getCharges() + p3.getCharges();
		return total;
	}
	
}
