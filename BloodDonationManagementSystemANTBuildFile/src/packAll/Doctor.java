package packAll;

class Doctor {
	  private String name;
	  private Hospital hospital;

	  public Doctor(String name) {
		super();
		this.name = name;
	}

	public Doctor(String name, Hospital hospital) {
	    this.name = name;
	    this.hospital = hospital;
	  }

	  public String getName() {
	    return name;
	  }

	  public Hospital getHospital() {
	    return hospital;
	  }
	}
