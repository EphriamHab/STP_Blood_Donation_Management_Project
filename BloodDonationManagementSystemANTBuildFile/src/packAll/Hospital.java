package packAll;
import java.util.*;

class Hospital {
	  private String name;
	  private List<Doctor> doctors;
	  private List<Donor> donors;
	  private List<Receptionist> receptionists;
	  private List<LabTechnician> labTechnicians;
	  private List<Recipient> recipients;
	  private static List<BloodTest> bloodTests = new ArrayList<>();

	  public Hospital(String name) {
	    this.name = name;
	    this.doctors = new ArrayList<>();
	    this.donors = new ArrayList<>();
	    this.receptionists = new ArrayList<>();
	    this.labTechnicians = new ArrayList<>();
	    this.recipients = new ArrayList<>();
	    this.bloodTests = new ArrayList<>();
	  }

	  public String getName() {
	    return name;
	  }

	  public List<Doctor> getDoctors() {
	    return doctors;
	  }
	  
	  public List<Donor> getDonor() {
		    return donors;
		  }

	  public List<Receptionist> getReceptionists() {
	    return receptionists;
	  }

	  public List<LabTechnician> getLabTechnicians() {
	    return labTechnicians;
	  }
	  public List<Recipient> getRecipient() {
		    return recipients;
		  }
	  public List<BloodTest> getBloodTest() {
		    return bloodTests;
		  }
	  public void addDoctor(Doctor doctor) {
	    doctors.add(doctor);
	  }
	  
	  public void addDonor(Donor donor) {
		    donors.add(donor);
		  }
	  public void addRecipient(Recipient recipient) {
		  recipients.add(recipient);
		  }
	  
	  public void addReceptionist(Receptionist receptionist) {
	    receptionists.add(receptionist);
	  }

	  public void addLabTechnician(LabTechnician labTechnician) {
	    labTechnicians.add(labTechnician);
	  }
	  public void addBloodTest(BloodTest bloodTest) {
		  bloodTests.add(bloodTest);
		  }

	  public boolean hasDoctor(Doctor doctor) {
	    return doctors.contains(doctor);
	  }
	  
	  public boolean hasDonor(Donor donor) {
		    return donors.contains(donor);
		  }

	  public boolean hasReceptionist(Receptionist receptionist) {
	    return receptionists.contains(receptionist);
	  }

	  public boolean hasLabTechnician(LabTechnician labTechnician) {
	    return labTechnicians.contains(labTechnician);
	  }
	}