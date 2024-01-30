package com.privan.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.privan.model.Model;
import com.privan.reposistory.myRepository;
import com.privan.servicei.ServiceI;


@Service
public class ServiceImpl implements ServiceI {
	
	
	@Autowired
	myRepository myrepo;

	@Override
	public String saveData(Model mm) {

		myrepo.save(mm);
		
		return mm.getPlayerName()+"saved";
	}

}
