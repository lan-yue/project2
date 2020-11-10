package com.daishi.ssm.service;

import com.daishi.ssm.pojo.TeamDTO;

public interface TeamHandleService {
    public TeamDTO signUp(TeamDTO team);
    
    public TeamDTO login(TeamDTO team);
    
    public TeamDTO addMember(TeamDTO team);
    
    public TeamDTO lookUpMessage(TeamDTO team);
    
    public TeamDTO uploadProduction(TeamDTO team);
    
    public TeamDTO exit(TeamDTO team);
    
}
