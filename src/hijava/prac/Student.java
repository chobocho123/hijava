package hijava.prac;

public class Student {
	private String studentNo;
	private String name;
	private int age;
	private String telno;

	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getStudentNo() {
		return this.studentNo;
	}
	
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
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

	public String getTelno() {
		if(this.telno == null || telno.length() < 4) {
		return telno;
		} else {
			return telno.substring(0, length() - 4);
		}
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", age=" + age + ", telno=" + telno + "]";
	}
	
	Student s = new Student();
}
	

