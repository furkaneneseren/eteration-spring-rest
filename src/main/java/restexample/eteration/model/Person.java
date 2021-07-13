package restexample.eteration.model;

public class Person {
	int id;
	String name;
	int age;
	String job;
	
	public Person() {
		
	}
	
	public Person(int id, String name, int age, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
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
