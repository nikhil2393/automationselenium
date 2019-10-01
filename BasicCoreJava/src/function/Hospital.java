package function;

public class Hospital {

	public String patientType;
	public String doctors;
	public String speciality;
	public int numOfBed;
	public int numOfDoctors;
	public String hospitalName;

	public void treatment() {
		System.out.println("patients with the " + patientType + " will be sent to the " + speciality + " doctor sharma");
	}

	public void Capacity() {
		System.out.println(hospitalName + " Hospital has " + numOfBed + " beds and " + numOfDoctors + " doctors");
	}
	
	//Default Constructor
	public Hospital()
	{
		
	}
	public Hospital(String patientType,String doctors,String speciality,int numOfBed,int numOfDoctors,String hospitalName)
	{
		this.patientType=patientType;
		this.doctors=doctors;
		this.speciality=speciality;
		this.numOfBed=numOfBed;
		this.numOfDoctors=numOfDoctors;
		this.hospitalName=hospitalName;
	}
}

