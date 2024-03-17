package com.rest.service;

import java.util.List;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rest.dao.RegisterDao;
import com.rest.dto.Dto;
import com.rest.model.LoginVo;
import com.rest.model.RegisterVo;

@Service
@Transactional
public class RegisterServiceImp implements RegisterService {
	
	@Autowired
	private RegisterDao registerDao;
	
	@Override
	public List<RegisterVo> getAll() {
		List<RegisterVo> getList=this.registerDao.getAll();
		System.out.println(getList.get(0));
		return getList;
	}
	
	public ResponseEntity<Response> createUser(Dto dto)
	{
		Response response =new Response();
		
		if(dto.getFirstname()==null||dto.getFirstname().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Firstname is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getLastname()==null||dto.getLastname().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Lastname is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getUsername()==null||dto.getUsername().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Username is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getPassword()==null||dto.getPassword().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Password is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		
		RegisterVo registerVo=new RegisterVo();
		LoginVo loginVo=new LoginVo();
		
		loginVo.setUsername(dto.getUsername());
		loginVo.setPassword(dto.getPassword());
		
		registerVo.setFirstname(dto.getFirstname());
		registerVo.setLastname(dto.getLastname());
		registerVo.setLogiinVo(loginVo);
		
		registerDao.insertLogin(loginVo);
		registerDao.insertRegister(registerVo);
		
		response.setMessage("inserted sucessfully");
		response.setStatus(true);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	public ResponseEntity<Response> editUser(Dto dto)
	{
		Response response =new Response();
		
		if(dto.getFirstname()==null||dto.getFirstname().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Firstname is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getLastname()==null||dto.getLastname().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Lastname is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getUsername()==null||dto.getUsername().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Username is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getPassword()==null||dto.getPassword().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Password is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getId()==0)
		{
			response.setStatus(false);
			response.setMessage("Empty id");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		
		RegisterVo registerVo=new RegisterVo();
		LoginVo loginVo=new LoginVo();
		
		loginVo.setUsername(dto.getUsername());
		loginVo.setPassword(dto.getPassword());
		
		registerVo.setId(dto.getId());
		registerVo.setFirstname(dto.getFirstname());
		registerVo.setLastname(dto.getLastname());
		registerVo.setLogiinVo(loginVo);
		
		registerDao.insertLogin(loginVo);
		registerDao.insertRegister(registerVo);
		
		response.setMessage("inserted sucessfully");
		response.setStatus(true);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
	
	public ResponseEntity<Response> search()
	{
		Response response=new Response();
		List<RegisterVo> getList=this.registerDao.getAll();
		response.setMessage("All the data found");
		response.setData(getList);
		response.setStatus(true);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Response> edit(int id) {
		
		Response response=new Response();
		List<RegisterVo> editList=this.registerDao.findById(id);
		if(!editList.isEmpty())
		{
			
			
			if(editList.get(0).getStatus()==false) {
				response.setStatus(false);
				response.setMessage("Wrong id");
				return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
				
			}
			response.setMessage("Id Found");
			response.setData(editList);
			response.setStatus(true);
			
			return new ResponseEntity<Response>(response,HttpStatus.OK);
		}
		response.setStatus(false);
		response.setMessage("Wrong id");
		return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
	}

	@Override
	public ResponseEntity<Response> delete(int id) {
		Response response=new Response();
		List<RegisterVo> editList=this.registerDao.findById(id);
		if(!editList.isEmpty())
		{
			
			
			if(editList.get(0).getStatus()==false) {
				response.setStatus(false);
				response.setMessage("Wrong id");
				return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
				
			}
			editList.get(0).setStatus(false);
			this.registerDao.insertRegister(editList.get(0));
			response.setMessage("Id Found and user Succesfully deleted");
//			response.setData(editList);
			response.setStatus(true);
			
			return new ResponseEntity<Response>(response,HttpStatus.OK);
		}
		response.setStatus(false);
		response.setMessage("Wrong id");
		return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
	}

	@Override
	public ResponseEntity<Response> update(Dto dto) {
		Response response =new Response();
		
		if(dto.getId()==0){
			response.setStatus(false);
			response.setMessage("Invalid Id");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getFirstname()==null||dto.getFirstname().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Firstname is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getLastname()==null||dto.getLastname().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Lastname is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getUsername()==null||dto.getUsername().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Username is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(dto.getPassword()==null||dto.getPassword().isEmpty())
		{
			response.setStatus(false);
			response.setMessage("Password is not valid");
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
		
		List<RegisterVo> up=this.registerDao.findById(dto.getId());
		RegisterVo registerVo= up.get(0);
		LoginVo loginVo=registerVo.getLogiinVo();
		
		
		loginVo.setId(loginVo.getId());
		loginVo.setUsername(dto.getUsername());
		loginVo.setPassword(dto.getPassword());
		
		registerVo.setFirstname(dto.getFirstname());
		registerVo.setLastname(dto.getLastname());
		registerVo.setLogiinVo(loginVo);
		
		registerDao.insertLogin(loginVo);
		registerDao.insertRegister(registerVo);
		
		response.setMessage("Update sucessfully");
		response.setStatus(true);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	
	}

}
