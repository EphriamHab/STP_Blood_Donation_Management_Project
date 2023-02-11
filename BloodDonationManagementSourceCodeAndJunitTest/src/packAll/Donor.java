package packAll;

public class Donor {
	  private String name;
	  private String bloodType;
	  private String Id;
	  private double weight;
	  private int age;
	
	public Donor(String name, String bloodType, String id, double weight, int age) {
		super();
		this.name = name;
		this.bloodType = bloodType;
		Id = id;
		this.weight = weight;
		this.age = age;
	}

	public Donor(String name, String bloodType) {
		this.name = name;
		this.bloodType = bloodType;
	}

	public Donor(String name, String bloodType, String Id) {
	    this.name = name;
	    this.bloodType = bloodType;
	    this.Id = Id;
	  }

	  public String getName() {
	    return name;
	  }

	  public String getBloodType() {
	    return bloodType;
	  }

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public boolean isEligible(double weight, int age) {
	    // Add your logic here to determine if a person is eligible to donate blood based on their weight and height
	    // For example, if weight is greater than 50 kilograms and height is greater than 5 feet, return true, else return false
	    if (weight > 50 && age > 18) {
	      return true;
	    } else {
	      return false;
	    }
	  }
  
	}