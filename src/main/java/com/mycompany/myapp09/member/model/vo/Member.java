package com.mycompany.myapp09.member.model.vo;

import java.sql.Date;

public class Member {
//	MEMBER_ID VARCHAR2(30) PRIMARY KEY,
//	MEMBER_PWD VARCHAR2(100) NOT NULL,
//	MEMBER_NM VARCHAR2(15) NOT NULL,
//	MEMBER_ENROLL_DT DATE DEFAULT SYSDATE
	private String id;
	private String memberPwd;
	private String memberNm;
	private Date memberEnrollDate;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", memberPwd=" + memberPwd + ", memberNm=" + memberNm + ", memberEnrollDate="
				+ memberEnrollDate + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberNm() {
		return memberNm;
	}

	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}

	public Date getMemberEnrollDate() {
		return memberEnrollDate;
	}

	public void setMemberEnrollDate(Date memberEnrollDate) {
		this.memberEnrollDate = memberEnrollDate;
	}
	

	
}
