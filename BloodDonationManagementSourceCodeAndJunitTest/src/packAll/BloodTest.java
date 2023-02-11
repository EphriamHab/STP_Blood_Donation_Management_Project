package packAll;

class BloodTest {
	  private Donor donor;
	  private String testResult;

	  public BloodTest(Donor donor, String testResult) {
	    this.donor = donor;
	    this.testResult = testResult;
	  }

	  public Donor getDonor() {
	    return donor;
	  }
	  

	  public String getTestResult() {
	    return testResult;
	  }
	  public boolean isEligible(String testResult,Donor donor) {
		    if (testResult.equals("Positive")) {
		      return false;
		    } else {
		      return true;
		    }
	}
}
