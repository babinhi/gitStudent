package Student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	StudentRepository sr = new StudentRepository();
	String loginsno = null;
	String loginpw = null;
	
	public void score() {
		System.out.print("점수를 작성할 학번을 입력해주세요 :");
		String sno = sc.next();
		StudentDTO s = sr.findById(sno);
		if(s == null) {
			System.out.println("찾을수 없는 학번입니다");
		}else {
			StudentDTO studentDTO = new StudentDTO();
			System.out.print("입력할 과목 점수 :");
			studentDTO.setStudynum(sc.nextInt());
			if(sr.score(studentDTO, sno)) {
				System.out.println("해당 학번의 점수가 입력되었습니다");
			}else {
				System.out.println("입력에 실패하였습니다");
			}
		}
		
	}

	public void findAll() {
		List<StudentDTO> list = sr.findAll();
		System.out.println("학번\t이름\t비밀번호\t나이\t전화번호\t\t학과\t과목\t점수");
		System.out.println("──────────────────────────────────────────────────────────────────");
		System.out.println();
		for(StudentDTO s : list) {
			System.out.println(s.toString());
		}
	}
	public void update() {
		System.out.print("수정 할 학번을 입력해주세요 :");
		String sno = sc.next();
		StudentDTO s = sr.findById(sno);
		if(s ==null) {
			System.out.println("찾을 수 없는 학번입니다");
		}else {
			StudentDTO studentDTO = new StudentDTO();
			System.out.print("수정할 과목 :");
			studentDTO.setStudy(sc.next());
			System.out.print("수정할 과목 점수:");
			studentDTO.setStudynum(sc.nextInt());
			if(sr.update(studentDTO, sno)) {
				System.out.println("해당 학번의 정보가 갱신 되었습니다");
			}else {
				System.out.println("갱신에 실패하였습니다");
			}
		}
	}
	public void save() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름 :");
		studentDTO.setName(sc.next());
		System.out.print("PW :");
		studentDTO.setPw(sc.next());
		System.out.print("나이 :");
		studentDTO.setAge(sc.nextInt());
		System.out.print("전화번호 :");
		studentDTO.setPhonemunber(sc.next());
		System.out.print("전공 :");
		studentDTO.setMajor(sc.next());
		System.out.print("과목 :");
		studentDTO.setStudy(sc.next());
		if(sr.save(studentDTO)) {
			System.out.println("회원가입을 축하드립니다");
		}else {
			System.out.println("다시 작성하여 주세요");
		}
	}
	public boolean loginCheck() {
		System.out.println("학번 :");
		String sno = sc.next();
		System.out.println("PW :");
		String pw = sc.next();
		if(sr.loginCheck(sno, pw)) {
			System.out.println("로그인 성공");
			
			loginsno = sno;
			loginpw = pw;
			return true;
		}else {
			System.out.println("다시 확인해주세요");
			return false;
		}
	}
	
	public void findById() {
		System.out.print("학번을 다시 적어주세요 :");
		String sno = sc.next();
		StudentDTO studentDTO = sr.findById(sno);
		if(studentDTO == null) {
			System.out.println("존재하지 않는 ID입니다");
		}else {
			System.out.println("학번\t이름\t비밀번호\t나이\t전화번호\t\t학과\t과목\t점수");
			System.out.println("──────────────────────────────────────────────────────────────────");
			System.out.println();
			System.out.println(studentDTO);
		}
		
	}
	public void scorecheck() {
		System.out.print("비밀번호를 입력해주세요 >");
		String pw = sc.next();
		StudentDTO studentDTO = sr.findById(pw);
		if(studentDTO == null) {
			System.out.println("올바르지 않는 비밀번호입니다");
		}else {
			System.out.println("학번\t이름\t비밀번호\t나이\t전화번호\t\t학과\t과목\t점수");
			System.out.println("──────────────────────────────────────────────────────────────────");
			System.out.println();
			System.out.println(studentDTO.toString());
		}
	}
	public void logout() {
		 loginsno = null;
		 loginpw = null;
		 System.out.println("로그아웃");
	}
	public void search() {
		System.out.print("검색할 이름 입력 :");
		String name = sc.next();
		sc.nextLine();
		StudentDTO studentDTO = sr.findById(name);
		if(studentDTO == null) {
			System.out.println("찾을수 없는 이름입니다");
		}else {	
			System.out.println("학번\t이름\t비밀번호\t나이\t전화번호\t\t학과\t과목\t점수");
			System.out.println("──────────────────────────────────────────────────────────────────");
			System.out.println();
			System.out.println(studentDTO.toString());
		}
	}
}
