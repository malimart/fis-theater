package com.fis.theatre.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.theatre.model.Role;
import com.fis.theatre.repository.RoleRepository;
import com.fis.theatre.web.dto.RoleDTO;

@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	public List<RoleDTO> getRolesOfAShow(String name){
		List<RoleDTO> retrunValue = new ArrayList<RoleDTO>();
		
		List<Role> roles = roleRepository.findByShowt_Name(name);
		
		for(Role role : roles) {
			RoleDTO temp = new RoleDTO();
			
			temp.setIdRole(role.getIdRole());
			temp.setName(role.getName());
			
			retrunValue.add(temp);
		}
		
		return retrunValue;
	}
}
