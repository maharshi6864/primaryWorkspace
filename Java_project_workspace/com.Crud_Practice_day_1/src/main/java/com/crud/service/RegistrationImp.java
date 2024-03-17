package com.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.model.Authentication;
import com.crud.model.PersonalDetails;
import com.crud.model.Student;
import com.crud.repository.AuthenticateDao;
import com.crud.repository.PersonalDao;
import com.crud.repository.StudentDao;

@Service
@Transactional
public class RegistrationImp implements Registration {
	
	@Autowired
	public StudentDao studentDao;
	
	@Autowired
	public PersonalDao personalDao;
	
	@Autowired
	public AuthenticateDao authenticateDao;

	@Override
	public void insert(Dto dto) {
		
			System.out.println("inserting Serives");
			Authentication authenticate=new Authentication();
			PersonalDetails personal=new PersonalDetails();
			Student student=new Student();
			
			personal.setAddress(dto.getAddress());
			personal.setHobbies(dto.getHobbies());
			personal.setPhone(dto.getPhone());
			this.personalDao.insert(personal);
			
			
			authenticate.setPassword(dto.getPassword());
			authenticate.setUsername(dto.getUsername());
			this.authenticateDao.insert(authenticate);
			
			student.setFirstname(dto.getFirstname());
			student.setLastname(dto.getLastname());
			student.setUqid((int)Math.floor(Math.random() * ( 999999-100000 + 1) + 100000));
			student.setGender(dto.getGender());
			student.setAuthentication(authenticate);
			student.setPersonal(personal);
			this.studentDao.insert(student);
			
			
			
		
	}

	@Override
	public List<Dto> search() {
		List<Dto> dtoList=new ArrayList<Dto>();
		List<Student> studentList=this.studentDao.search();
		for(Student s :studentList)
		{
			Dto dto=new Dto();
			dto.setId(s.getId());
			dto.setUqid(s.getUqid());
			dto.setFirstname(s.getFirstname());
			dto.setLastname(s.getLastname());
			dto.setGender(s.getGender());
			dto.setHobbies(s.getPersonal().getHobbies());
			dto.setUsername(s.getAuthentication().getUsername());
			dto.setPassword(s.getAuthentication().getPassword());
			dto.setAddress(s.getPersonal().getAddress());
			dto.setPhone(s.getPersonal().getPhone());
			dtoList.add(dto);
		}
		return dtoList;
	}

	@Override
	public void delete(Dto dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Dto> findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
