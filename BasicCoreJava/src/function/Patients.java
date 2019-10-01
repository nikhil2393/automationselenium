package function;

public class Patients {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Hospital hospital1=new Hospital();
		hospital1.hospitalName="Noble";
		hospital1.patientType="Bone injury";
		hospital1.speciality="Orthopedic";
		hospital1.doctors="Dr.Sharma";
		hospital1.numOfBed=100;
		hospital1.numOfDoctors=10;
		
		
		hospital1.treatment();
		hospital1.Capacity();
		
		
		Hospital hospital2= new Hospital();
		
		hospital2.hospitalName="Columbai Asia";
		hospital2.patientType="Cancer";
		hospital2.speciality="Oncologist";
		hospital2.doctors="Dr.Batra";
		hospital2.numOfBed=50;
		hospital2.numOfDoctors=5;
		
		hospital2.treatment();
		hospital2.Capacity();
		
		Hospital hospital3 =new Hospital("Cavity","Manohar","Dentiest",50,5,"City");
		hospital3.treatment();
		hospital3.Capacity();
	}

}
