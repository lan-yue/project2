package com.daishi.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.daishi.ssm.pojo.TeamDTO;
import com.daishi.ssm.service.impl.TeamHandleServiceImpl;

@RestController
@RequestMapping("teamHandle")
public class TeamHandleController {
    
    @Autowired
    private TeamHandleServiceImpl fanClassRecordServiceImpl;

    //注册
    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public TeamDTO signUp(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");
        TeamDTO teamDTO = fanClassRecordServiceImpl.signUp(team);
        return teamDTO;
    }
    
    //登陆
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public TeamDTO login(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");
        TeamDTO teamDTO = fanClassRecordServiceImpl.login(team);
        return teamDTO;
    }
    
    //添加成员
    @RequestMapping(value = "/addMember", method = RequestMethod.POST)
    public TeamDTO addMember(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");//成员信息在TeamDTO 中的List中
        TeamDTO teamDTO = fanClassRecordServiceImpl.addMember(team);
        return teamDTO;
    }
    
    //查看报名信息
    @RequestMapping(value = "/lookUpMessage", method = RequestMethod.POST)
    public TeamDTO lookUpMessage(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");//可能不需要
        TeamDTO teamDTO = fanClassRecordServiceImpl.lookUpMessage(team);
        return teamDTO;
    }
    
    //上传作品
    @RequestMapping(value = "/uploadProduction", method = RequestMethod.POST)
    public TeamDTO uploadProduction(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");
        TeamDTO teamDTO = fanClassRecordServiceImpl.uploadProduction(team);
        return teamDTO;
    }
    
    //退出登陆
    @RequestMapping(value = "/exit", method = RequestMethod.POST)
    public TeamDTO exit(HttpSession session) {
    	TeamDTO team = (TeamDTO) session.getAttribute("team");
        TeamDTO teamDTO = fanClassRecordServiceImpl.exit(team);
        return teamDTO;
    }
}
