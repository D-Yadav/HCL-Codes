package com.hcl.project;

import java.util.List;

public class StudentBAL {
	static StringBuilder sb=new StringBuilder();
	public boolean addStudentBAL(Student objStudent) throws StudentException{
		boolean isAdded=true;
		if(objStudent.getSno()<=0){
			sb.append("StudentNo cannot be Negative or Zero \r\n");
			isAdded=false; 
		}
		if(objStudent.getName().length()<=3){
			sb.append("Name More than 3 characters \r\n");
			isAdded=false;
		}
		if(objStudent.getCgp()<0){
			sb.append("Cgp Non-Negative \r\n");
			isAdded=false;
		}
		if(isAdded==false){
		throw new StudentException(sb.toString());
		}else{
			new StudentDAO().addStudentDAO(objStudent);
		}
		return isAdded;
	}
	public List<Student> showStudentBal(){
		return new StudentDAO().showStudentDAO();
	}
	public Student searchStudentBal(int sno){
		return new StudentDAO().searchStudentDAO(sno);
	}
	public String updateStudentBal(Student objStudent){
		return new StudentDAO().updateStudentDAO(objStudent);
	}
	public String deleteStudentBal(int sno){
		return new StudentDAO().deleteStudentDAO(sno);	
}
}