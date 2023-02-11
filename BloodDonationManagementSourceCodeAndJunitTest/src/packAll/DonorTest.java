package packAll;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DonorTest {

  @Test
  public void testGetName() {
    Donor donor = new Donor("John Doe", "AB+","34",67,38);
    assertEquals("John Doe", donor.getName());
  }

  @Test
  public void testGetBloodType() {
    Donor donor = new Donor("John Doe", "AB+","34");
    assertEquals("AB+", donor.getBloodType());
  }

}
