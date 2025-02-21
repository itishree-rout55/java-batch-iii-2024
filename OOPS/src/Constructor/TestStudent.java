package Constructor;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Kamlesh");
		Student s3 = new Student("Rabi",34);
		
		s1.show();
		s2.show();
		s3.show();

	}

}
