package com.daishi.ssm.service;

import com.daishi.ssm.pojo.TeamDTO;

public interface AdminHandleService {
	
    public TeamDTO checkTeam(TeamDTO team);
   
    public TeamDTO addJudge(TeamDTO team);
    
    public TeamDTO export(TeamDTO team);
    
    public TeamDTO exitAdmin(TeamDTO team);
}
