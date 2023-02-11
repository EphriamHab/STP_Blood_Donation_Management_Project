package packAll;


class LabTechnician {
  private String name;
  private Hospital hospital;
  
  
public LabTechnician(String name) {
	super();
	this.name = name;
}

public LabTechnician(String name, Hospital hospital) {
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