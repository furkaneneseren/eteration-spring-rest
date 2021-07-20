package restexample.eteration.dto;

public class PersonDTO {
	public int id;
	public String name;
	public int age;
	public String job;
	
	public int getAge() {
		return age;
	}
	
	public String getJob() {
		return job;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
