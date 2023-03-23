package Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	List<StudentDTO> list = new ArrayList<>();
	
	public List<StudentDTO> findAll(){
		return list;
	}
	
	public boolean update(StudentDTO studentDTO, String sno) {
		for(StudentDTO no : list) {
			if(no.getSno().equals(sno)) {
				no.setStudy(studentDTO.getStudy());
				no.setStudynum(studentDTO.getStudynum());
				return true;
			}
			
		}return false;
	}
	public boolean score(StudentDTO studentDTO, String sno) {
		for(StudentDTO no : list) {
			if(no.getSno().equals(sno)) {
				no.setStudynum(studentDTO.getStudynum());
				return true;
			}
			
		}return false;
	}
	
	public boolean save(StudentDTO studentDTO) {
		boolean result = list.add(studentDTO);
		return result;
	}
	public boolean loginCheck(String sno, String pw) {
		for(StudentDTO s : list ) {
			if(sno.equals(s.getSno())&& pw.equals(s.getPw())){
				return true;
			}
		}return false;
	}
	
	public StudentDTO findById(String sno) {
		for(StudentDTO no : list) {
			if(no.getSno().equals(sno)) {
				return no;
			}
		}return null;
	}
	public boolean search(String name){
		for(StudentDTO no : list){
			if(no.getName().equals(name)) {
				return true;
			}
		}return false;
	}
	
//	public StudentDTO scorecheck(String pw) {
//		for(StudentDTO no : list) {
//			if(no.getPw().equals(pw)) {
//				return no;
//			}
//		}return null;
//	}
}
