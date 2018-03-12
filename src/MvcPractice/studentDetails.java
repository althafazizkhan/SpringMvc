package MvcPractice;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;



public class studentDetails {
	
	@Size(min=4, max=11, message= " please enter values betwween {min} and {max}")
	public String name;

	
	public int number;
	
	@Past
	public Date DOB;
	public addess adress;
	
	public addess getAdress() {
		return adress;
	}
	public void setAdress(addess adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}

}
