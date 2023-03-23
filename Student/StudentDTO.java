package Student;

import java.text.DecimalFormat;

public class StudentDTO {

	private static int number = 301;
	
	private String sno;
	private String name;
	private String pw;
	private int age;
	private String phonemunber;
	private String major;
	private String study;
	private int studynum;
	private int total;
	private String grade;
	
	public StudentDTO() {
		this.sno = "N"+number++;
	}
	public String getSno() {
		return sno;
	}
	public void setSno() {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhonemunber() {
		return phonemunber;
	}
	public void setPhonemunber(String phonemunber) {
		this.phonemunber = phonemunber;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public int getStudynum() {
		return studynum;
	}
	public void setStudynum(int studynum) {
		this.studynum = studynum;
	}

	public int getTotal() {
		return total;
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {

		this.grade = grade;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",
				sno, name, pw, age, phonemunber, major);
		
	}
	@Override
	public String toString() {
		String i =  sno + " \t " + name + " \t "+pw +" \t " + age + " \t " + phonemunber
				+ " \t " + major + " \t " 
				+ study + " \t "+ studynum +"\t";
		return i;
	}
	
	
	
	
}
