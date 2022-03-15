package lt.vtmc.Linkuviene;

public class Bean {
private String message;
private String name;
private int age;
private int area;
private String color;
	
	
	public String getResult() {
		return getName();		
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	

	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public void initialize() {
		System.out.println("Initialization: " + getName());
	}
	
	public void destroy() {
		System.out.println("Destroy: " + getName());
	}
}
