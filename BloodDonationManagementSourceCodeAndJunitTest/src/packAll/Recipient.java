package packAll;

class Recipient {
	  private String name;
	  private String bloodType;
	  private Hospital hospital;

	public Recipient(String name, String bloodType, Hospital hospital) {
	this.name = name;
	this.bloodType = bloodType;
	this.hospital = hospital;
	}

	public String getName() {
	return name;
	}

	public String getBloodType() {
	return bloodType;
	}

	public Hospital getHospital() {
	return hospital;
	}
	}
