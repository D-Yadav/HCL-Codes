package com.hcl.project;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDAO {
static List<Student> LstStudent = null;
static ResourceBundle rb=null;
static {
	LstStudent  = new ArrayList<Student>();
	rb=ResourceBundle.getBundle("student");
}

public String addStudentDAO(Student student){
	LstStudent.add(student);
	return rb.getString("add");
	
}
public List<Student> showStudentDAO(){
	return LstStudent;
	
}
public Student searchStudentDAO(int sno){
	Student objStudent=null;
	for (Student student : LstStudent) {
		if(student.getSno()==sno){
			objStudent=student;
		}
	}
	return objStudent;
}
public String deleteStudentDAO(int sno){
	String result="";
	Student student=searchStudentDAO(sno);
	if(student!=null){
		LstStudent.remove(student);
		return rb.getString("delete");
		
}else{
	result = rb.getString("ntFound");
  }
	return result;
  }
public String updateStudentDAO(Student objStudent){
	Student student=searchStudentDAO(objStudent.getSno());
	String result="";
	if(student!=null){
		for(Student s : LstStudent){
			if(s.getSno()==objStudent.getSno()){
				s.setName(objStudent.getName());
				s.setCity(objStudent.getCity());
				s.setCgp(objStudent.getCgp());
			}
		}
		return rb.getString("upd");
	}else{
		result= rb.getString("ntFound");
	}
	return result;
}
}