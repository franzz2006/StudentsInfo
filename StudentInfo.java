package StudentsInfo;

	public class StudentInfo {
	    private String name = "";
	    private int age = 0;
	    private String course = "";
	    
	    public StudentInfo (String name, int age, String course) {
	        this.name = name;
	        this.age = age;
	        this.course = course;
	    }
	    
	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Course: " + course);
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        System.out.println("Student Information");
	        System.out.println("------------");
	        StudentInfo student0 = new StudentInfo("John Franz Caballero", 20, "BSIT");
	        StudentInfo student1 = new StudentInfo("Franz Lebron", 19, "BSHM");

	        student0.displayInfo();
	        student1.displayInfo();
	    }
	}
	
	

