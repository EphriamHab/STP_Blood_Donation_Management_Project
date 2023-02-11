package packAll;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReceptionistTest {
    @Test
    public void testGetName() {
        Hospital hospital = new Hospital("Hospital 1");
        Receptionist receptionist = new Receptionist("Receptionist 1", hospital);
        assertEquals("Receptionist 1", receptionist.getName());
    }

    @Test
    public void testGetHospital() {
        Hospital hospital = new Hospital("Hospital 1");
        Receptionist receptionist = new Receptionist("Receptionist 1", hospital);
        assertEquals(hospital, receptionist.getHospital());
    }
}
