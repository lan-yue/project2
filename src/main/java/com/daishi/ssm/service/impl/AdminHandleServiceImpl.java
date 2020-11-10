package com.daishi.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daishi.ssm.dao.Class_recordModelMapper;
import com.daishi.ssm.pojo.TeamDTO;
import com.daishi.ssm.service.TeamHandleService;

@Service
public class AdminHandleServiceImpl implements TeamHandleService {
	
    @Autowired
    private Class_recordModelMapper classrecord;

	@Override
	public TeamDTO signUp(TeamDTO team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamDTO login(TeamDTO team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamDTO addMember(TeamDTO team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamDTO lookUpMessage(TeamDTO team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamDTO uploadProduction(TeamDTO team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamDTO exit(TeamDTO team) {
		// TODO Auto-generated method stub
		return null;
	}
    
	

}
