package packAll;

import org.junit.Test;
import static org.junit.Assert.*;

public class HospitalTest {
  
  @Test
  public void testDonor() {
    Donor donor = new Donor("John Doe", "A+","34");
    assertEquals("John Doe", donor.getName());
    assertEquals("A+", donor.getBloodType());
  }

  @Test
  public void testDoctor() {
    Hospital hospital = new Hospital("General Hospital");
    Doctor doctor = new Doctor("Jane Doe", hospital);
    assertEquals("Jane Doe", doctor.getName());
    assertEquals(hospital, doctor.getHospital());
  }

  @Test
  public void testHospital() {
    Hospital hospital = new Hospital("General Hospital");
    assertEquals("General Hospital", hospital.getName());

    Doctor doctor1 = new Doctor("Jane Doe", hospital);
    Doctor doctor2 = new Doctor("John Doe", hospital);
    Receptionist receptionist1 = new Receptionist("Mary Doe", hospital);
    Receptionist receptionist2 = new Receptionist("Mike Doe", hospital);
    LabTechnician labTechnician1 = new LabTechnician("Tom Doe", hospital);
    LabTechnician labTechnician2 = new LabTechnician("Tina Doe", hospital);

    hospital.addDoctor(doctor1);
    hospital.addDoctor(doctor2);
    hospital.addReceptionist(receptionist1);
    hospital.addReceptionist(receptionist2);
    hospital.addLabTechnician(labTechnician1);
    hospital.addLabTechnician(labTechnician2);

    assertTrue(hospital.hasDoctor(doctor1));
    assertTrue(hospital.hasDoctor(doctor2));
    assertTrue(hospital.hasReceptionist(receptionist1));
    assertTrue(hospital.hasReceptionist(receptionist2));
    assertTrue(hospital.hasLabTechnician(labTechnician1));
    assertTrue(hospital.hasLabTechnician(labTechnician2));
  }

  @Test
  public void testReceptionist() {
    Hospital hospital = new Hospital("General Hospital");
    Receptionist receptionist = new Receptionist("Mary Doe", hospital);
    assertEquals("Mary Doe", receptionist.getName());
    assertEquals(hospital, receptionist.getHospital());
  }

  @Test
  public void testLabTechnician() {
    Hospital hospital = new Hospital("General Hospital");
    LabTechnician labTechnician = new LabTechnician("Tom Doe", hospital);
    assertEquals("Tom Doe", labTechnician.getName());
    assertEquals(hospital, labTechnician.getHospital());
  }

  @Test
  public void testBloodTest() {
    Donor donor = new Donor("John Doe", "A+","21");
    BloodTest bloodTest = new BloodTest(donor, "Positive");
    assertEquals(donor, bloodTest.getDonor());
    assertEquals("Positive", bloodTest.getTestResult());
  }

  @Test
  public void testRecipient() {
    Hospital hospital = new Hospital("General Hospital");
    Recipient recipient = new Recipient("Jane Doe", "sdajk",hospital);
  }
}

