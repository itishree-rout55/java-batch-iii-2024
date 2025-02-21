package Constructor;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		name ="Hari";
		age = 34;
	}
    public Student(String name) {
    	this.name = name;
		age = 54;
	}
    public Student(String name,int age) {
    	this.name = name;
    	this.age = age;
    }
    void show() {
    	System.out.println("Name : "+name+" Age: "+age);
    }

}
