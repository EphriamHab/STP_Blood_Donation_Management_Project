package packAll;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {

  @Test
  public void testGetName() {
    Hospital hospital = new Hospital("St. Mary's Hospital");
    Doctor doctor = new Doctor("Jane Smith", hospital);
    assertEquals("Jane Smith", doctor.getName());
  }

  @Test
  public void testGetHospital() {
    Hospital hospital = new Hospital("St. Mary's Hospital");
    Doctor doctor = new Doctor("Jane Smith", hospital);
    assertEquals(hospital, doctor.getHospital());
  }

}
