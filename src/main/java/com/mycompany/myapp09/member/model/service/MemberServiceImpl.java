package com.mycompany.myapp09.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp09.member.model.dao.MemberDao;
import com.mycompany.myapp09.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDao memberDao;

	@Override
	public Member idCheck(Member mvo) throws Exception {
		return memberDao.idCheck(mvo);
	}

	
	

}
