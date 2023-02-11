package packAll;

class Receptionist {
	  private String name;
	  private Hospital hospital;

	  public Receptionist(String name) {
		super();
		this.name = name;
	}

	public Receptionist(String name, Hospital hospital) {
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
