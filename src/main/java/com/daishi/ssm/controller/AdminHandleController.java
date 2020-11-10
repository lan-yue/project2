package com.daishi.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daishi.ssm.pojo.TeamDTO;
import com.daishi.ssm.service.impl.TeamHandleServiceImpl;

@RestController
@RequestMapping("adminHandle")
public class AdminHandleController {
    
    @Autowired
    private TeamHandleServiceImpl fanClassRecordServiceImpl;

    //审核团队信息
    @RequestMapping(value = "/checkTeam", method = RequestMethod.POST)
    public TeamDTO checkTeam(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");
        TeamDTO teamDTO = fanClassRecordServiceImpl.signUp(team);
        return teamDTO;
    }
    
    //添加评委
    @RequestMapping(value = "/addJudge", method = RequestMethod.POST)
    public TeamDTO addJudge(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");
        TeamDTO teamDTO = fanClassRecordServiceImpl.login(team);
        return teamDTO;
    }
    
    //导出报名信息
    @RequestMapping(value = "/export", method = RequestMethod.POST)
    public TeamDTO export(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");//成员信息在TeamDTO 中的List中
        TeamDTO teamDTO = fanClassRecordServiceImpl.addMember(team);
        return teamDTO;
    }
    
    //退出登陆
    @RequestMapping(value = "/exitAdmin", method = RequestMethod.POST)
    public TeamDTO exitAdmin(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");//可能不需要
        TeamDTO teamDTO = fanClassRecordServiceImpl.lookUpMessage(team);
        return teamDTO;
    }
    
}
