package com.daishi.ssm.pojo;

import java.util.List;

/*
 * 团队对象
 * */
public class TeamDTO {
	private String account;
	private String passWord;
	private String teamName;
	private String teacher1;
	private String teacher2;
	
	private List<MemberDTO> memberDTOList;
	
	private String status;
	private String judge;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeacher1() {
		return teacher1;
	}
	public void setTeacher1(String teacher1) {
		this.teacher1 = teacher1;
	}
	public String getTeacher2() {
		return teacher2;
	}
	public void setTeacher2(String teacher2) {
		this.teacher2 = teacher2;
	}
	public List<MemberDTO> getMemberDTOList() {
		return memberDTOList;
	}
	public void setMemberDTOList(List<MemberDTO> memberDTOList) {
		this.memberDTOList = memberDTOList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getJudge() {
		return judge;
	}
	public void setJudge(String judge) {
		this.judge = judge;
	}
}
